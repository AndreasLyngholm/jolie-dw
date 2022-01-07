from runtime import Runtime
from file import File

type NUXTConfig: void {
  location?: string
  root?: string
  dataDir?: string
  contentDir?: string
  servicesDir?: string
  defaultPage?: string
}

service Launcher (config : NUXTConfig ) {
	embed Runtime as runtime
	embed File as file

	init {
	
		getRealServiceDirectory@file()( home )
		getFileSeparator@file()( sep )

		if( !is_defined( config.location    ) ) config.location    = "socket://localhost:8000"
		if( !is_defined( config.root        ) ) config.root        = home
		if( !is_defined( config.contentDir  ) ) config.contentDir  = config.root + "www" + sep
		if( !is_defined( config.servicesDir ) ) config.servicesDir = config.root + "services" + sep
		if( !is_defined( config.dataDir     ) ) config.dataDir     = config.root + "data" + sep
		if( !is_defined( config.defaultPage ) ) config.defaultPage = "index.ol"

		loadEmbeddedService@runtime( {
			filepath = home + sep + "gateway.ol"
			service = "Gateway"
			params -> config
		} )()
	}

  main { 
		linkIn( Shutdown )
  }
}