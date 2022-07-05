package cfs.com.br.mainactivity.codelab.util

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.navigation.fragment.findNavController

fun Fragment.navTo(@IdRes dest: Int) = findNavController().navigate(dest)
fun Fragment.navTo(@IdRes dest: Int, args: Bundle)= findNavController().navigate(dest,args)
fun Fragment.toast(msg: String) = Toast.makeText(requireContext(),msg,Toast.LENGTH_LONG).show()