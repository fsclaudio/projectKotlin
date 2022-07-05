package cfs.com.br.mainactivity.toast

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import cfs.com.br.mainactivity.R
import cfs.com.br.mainactivity.databinding.FragmentToastSnakeBinding
import cfs.com.br.mainactivity.codelab.util.toast
import com.google.android.material.snackbar.Snackbar

class ToastSnakeFragment : Fragment(R.layout.fragment_toast_snake) {
  private lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().requestedOrientation= ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

        binding= FragmentToastSnakeBinding.bind(view)

        binding.toast.setOnClickListener{
            val msg= "Message para voce!"
            Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT)
                .show()
        }

        binding.snake.setOnClickListener{
            Snackbar.make(view, "oi Snake", Snackbar.LENGTH_SHORT)
                .show()
        }

        binding.snakeAction.setOnClickListener{
            Snackbar.make(view, "Sanke com Action", Snackbar.LENGTH_SHORT)
                .setAction("okay"){toast("I am a snake")}
                .show()
        }
    }
}