public interface PluginInterface {

	 String getName();

	 int getNumParameters();

	 String checkParameters(Object[] parameters);

	 Object run(Object[] parameters);
}