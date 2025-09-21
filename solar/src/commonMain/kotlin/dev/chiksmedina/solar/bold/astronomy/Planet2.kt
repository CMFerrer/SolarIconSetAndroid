package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Planet2: ImageVector
    get() {
        if (_planet2 != null) {
            return _planet2!!
        }
        _planet2 = Builder(
            name = "Planet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 11.8805f, 19.9974f, 11.7615f, 19.9922f, 11.6433f)
                curveTo(20.2479f, 11.4141f, 20.4882f, 11.1864f, 20.7118f, 10.9611f)
                curveTo(21.0037f, 10.6672f, 21.002f, 10.1923f, 20.708f, 9.9005f)
                curveTo(20.4336f, 9.628f, 20.0014f, 9.6114f, 19.7077f, 9.8497f)
                curveTo(19.4023f, 8.7525f, 18.8688f, 7.7502f, 18.1616f, 6.8973f)
                curveTo(18.4607f, 6.8461f, 18.7436f, 6.8084f, 19.0087f, 6.784f)
                curveTo(19.4212f, 6.746f, 19.7247f, 6.3809f, 19.6868f, 5.9684f)
                curveTo(19.6488f, 5.556f, 19.2837f, 5.2523f, 18.8712f, 5.2903f)
                curveTo(18.4474f, 5.3293f, 17.9972f, 5.3964f, 17.5262f, 5.4892f)
                curveTo(17.3267f, 5.5285f, 17.1614f, 5.6435f, 17.0543f, 5.7985f)
                curveTo(15.6765f, 4.6742f, 13.917f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 12.2776f, 4.0141f, 12.552f, 4.0417f, 12.8223f)
                curveTo(3.7899f, 12.7532f, 3.509f, 12.8177f, 3.3114f, 13.0159f)
                curveTo(2.9765f, 13.3517f, 2.676f, 13.6846f, 2.415f, 14.0113f)
                curveTo(2.1565f, 14.3349f, 2.2092f, 14.8069f, 2.5329f, 15.0654f)
                curveTo(2.8565f, 15.3239f, 3.3284f, 15.2711f, 3.587f, 14.9475f)
                curveTo(3.7887f, 14.695f, 4.0247f, 14.4302f, 4.2938f, 14.1557f)
                curveTo(4.6075f, 15.2796f, 5.1606f, 16.3037f, 5.8945f, 17.1697f)
                curveTo(5.6682f, 17.3368f, 5.5458f, 17.6248f, 5.604f, 17.919f)
                curveTo(5.6844f, 18.3253f, 6.0789f, 18.5896f, 6.4853f, 18.5092f)
                curveTo(6.7024f, 18.4662f, 6.9246f, 18.4177f, 7.1512f, 18.3637f)
                curveTo(8.4966f, 19.3903f, 10.1771f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(7.1512f, 18.3637f)
                curveTo(6.6904f, 18.012f, 6.2689f, 17.6114f, 5.8945f, 17.1697f)
                curveTo(5.9807f, 17.106f, 6.082f, 17.0599f, 6.1942f, 17.0377f)
                curveTo(7.1909f, 16.8405f, 8.3311f, 16.5084f, 9.5558f, 16.0486f)
                curveTo(9.9436f, 15.903f, 10.376f, 16.0994f, 10.5216f, 16.4872f)
                curveTo(10.6671f, 16.8749f, 10.4708f, 17.3073f, 10.083f, 17.4529f)
                curveTo(9.0533f, 17.8395f, 8.0653f, 18.1459f, 7.1512f, 18.3637f)
                close()
                moveTo(19.7077f, 9.8497f)
                curveTo(19.6869f, 9.8666f, 19.6667f, 9.8848f, 19.6474f, 9.9043f)
                curveTo(18.9609f, 10.5957f, 18.0797f, 11.3337f, 17.0388f, 12.0753f)
                curveTo(16.7014f, 12.3157f, 16.6228f, 12.784f, 16.8631f, 13.1213f)
                curveTo(17.1035f, 13.4587f, 17.5718f, 13.5373f, 17.9091f, 13.297f)
                curveTo(18.6809f, 12.7471f, 19.3806f, 12.1912f, 19.9922f, 11.6433f)
                curveTo(19.965f, 11.0246f, 19.8676f, 10.4241f, 19.7077f, 9.8497f)
                close()
                moveTo(20.9366f, 5.3792f)
                curveTo(20.5336f, 5.2838f, 20.1294f, 5.5331f, 20.034f, 5.9362f)
                curveTo(19.9385f, 6.3393f, 20.1879f, 6.7434f, 20.5909f, 6.8389f)
                curveTo(20.985f, 6.9322f, 21.1368f, 7.0712f, 21.1932f, 7.1614f)
                curveTo(21.2565f, 7.2627f, 21.3262f, 7.5273f, 21.0363f, 8.1094f)
                curveTo(20.8516f, 8.4801f, 21.0025f, 8.9304f, 21.3732f, 9.1151f)
                curveTo(21.744f, 9.2998f, 22.1943f, 9.1489f, 22.379f, 8.7782f)
                curveTo(22.7566f, 8.02f, 22.9422f, 7.1289f, 22.4648f, 6.3658f)
                curveTo(22.1206f, 5.8157f, 21.5416f, 5.5225f, 20.9366f, 5.3792f)
                close()
                moveTo(2.8148f, 16.2501f)
                curveTo(2.9406f, 15.8555f, 2.7226f, 15.4336f, 2.3279f, 15.3078f)
                curveTo(1.9333f, 15.1821f, 1.5114f, 15.4f, 1.3856f, 15.7947f)
                curveTo(1.1939f, 16.3963f, 1.1735f, 17.0573f, 1.5349f, 17.6349f)
                curveTo(1.9878f, 18.3587f, 2.8415f, 18.6413f, 3.6891f, 18.7224f)
                curveTo(4.1014f, 18.7619f, 4.4676f, 18.4596f, 4.5071f, 18.0473f)
                curveTo(4.5466f, 17.635f, 4.2443f, 17.2687f, 3.832f, 17.2293f)
                curveTo(3.1376f, 17.1628f, 2.8835f, 16.9624f, 2.8065f, 16.8393f)
                curveTo(2.7568f, 16.7598f, 2.7048f, 16.5954f, 2.8148f, 16.2501f)
                close()
                moveTo(15.7504f, 14.704f)
                curveTo(16.106f, 14.4915f, 16.2218f, 14.0309f, 16.0093f, 13.6754f)
                curveTo(15.7967f, 13.3199f, 15.3362f, 13.204f, 14.9807f, 13.4166f)
                curveTo(14.4991f, 13.7045f, 13.9974f, 13.9881f, 13.4781f, 14.2648f)
                curveTo(12.9445f, 14.5491f, 12.4132f, 14.8149f, 11.8883f, 15.0615f)
                curveTo(11.5134f, 15.2376f, 11.3522f, 15.6843f, 11.5283f, 16.0592f)
                curveTo(11.7044f, 16.4341f, 12.1511f, 16.5953f, 12.526f, 16.4192f)
                curveTo(13.0739f, 16.1618f, 13.6277f, 15.8847f, 14.1834f, 15.5887f)
                curveTo(14.7242f, 15.3005f, 15.2474f, 15.0048f, 15.7504f, 14.704f)
                close()
            }
        }
            .build()
        return _planet2!!
    }

private var _planet2: ImageVector? = null
