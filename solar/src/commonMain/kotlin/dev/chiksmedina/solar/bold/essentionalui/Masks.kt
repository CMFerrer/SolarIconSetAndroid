package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Masks: ImageVector
    get() {
        if (_masks != null) {
            return _masks!!
        }
        _masks = Builder(
            name = "Masks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.5366f, 9.136f)
                lineTo(20.6914f, 12.4334f)
                curveTo(20.2619f, 14.1092f, 19.3848f, 15.2884f, 18.3546f, 16.1176f)
                curveTo(18.5739f, 14.974f, 18.569f, 13.7001f, 18.2112f, 12.3042f)
                lineTo(17.3472f, 8.9333f)
                curveTo(17.296f, 8.7334f, 17.2459f, 8.538f, 17.1966f, 8.3498f)
                curveTo(17.3679f, 8.2721f, 17.5772f, 8.2475f, 17.7955f, 8.3059f)
                curveTo(18.1742f, 8.4074f, 18.4044f, 8.7121f, 18.4332f, 9.0081f)
                curveTo(18.4732f, 9.4204f, 18.8398f, 9.7222f, 19.2521f, 9.6821f)
                curveTo(19.6644f, 9.6421f, 19.9662f, 9.2755f, 19.9261f, 8.8632f)
                curveTo(19.8347f, 7.9207f, 19.1428f, 7.114f, 18.1837f, 6.857f)
                curveTo(17.7011f, 6.7277f, 17.2074f, 6.7528f, 16.766f, 6.9078f)
                lineTo(16.7494f, 6.8632f)
                curveTo(16.5249f, 6.2668f, 16.1968f, 5.6344f, 15.5778f, 5.1695f)
                curveTo(15.2393f, 4.9153f, 14.8568f, 4.7244f, 14.4479f, 4.6085f)
                curveTo(13.6893f, 4.3934f, 12.9853f, 4.5316f, 12.3843f, 4.7316f)
                curveTo(11.8259f, 4.9174f, 11.1749f, 5.2223f, 10.4597f, 5.5573f)
                lineTo(10.388f, 5.5909f)
                curveTo(9.2034f, 6.1456f, 8.7294f, 6.3644f, 8.2439f, 6.5185f)
                curveTo(8.0965f, 6.5653f, 7.948f, 6.6078f, 7.7985f, 6.646f)
                lineTo(8.1251f, 5.3793f)
                curveTo(8.5657f, 3.6604f, 8.786f, 2.8009f, 9.3612f, 2.3689f)
                curveTo(9.5541f, 2.224f, 9.7702f, 2.1166f, 9.9994f, 2.0516f)
                curveTo(10.683f, 1.8578f, 11.46f, 2.2216f, 13.014f, 2.9493f)
                curveTo(14.1647f, 3.4882f, 14.7401f, 3.7576f, 15.3404f, 3.9482f)
                curveTo(15.5492f, 4.0145f, 15.7599f, 4.0735f, 15.9724f, 4.1252f)
                curveTo(16.5835f, 4.274f, 17.2106f, 4.3414f, 18.4649f, 4.4762f)
                curveTo(20.1587f, 4.6583f, 21.0057f, 4.7493f, 21.505f, 5.2745f)
                curveTo(21.6724f, 5.4505f, 21.8082f, 5.6566f, 21.9059f, 5.8828f)
                curveTo(22.1974f, 6.5577f, 21.9772f, 7.4171f, 21.5366f, 9.136f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.7582f, 12.6766f)
                lineTo(15.9131f, 9.3793f)
                curveTo(15.4725f, 7.6604f, 15.2522f, 6.8009f, 14.677f, 6.3689f)
                curveTo(14.4841f, 6.224f, 14.268f, 6.1166f, 14.0388f, 6.0516f)
                curveTo(13.3551f, 5.8578f, 12.5782f, 6.2216f, 11.0242f, 6.9493f)
                curveTo(9.8735f, 7.4882f, 9.2981f, 7.7576f, 8.6977f, 7.9482f)
                curveTo(8.489f, 8.0145f, 8.2782f, 8.0735f, 8.0658f, 8.1252f)
                curveTo(7.4547f, 8.274f, 6.8276f, 8.3414f, 5.5733f, 8.4762f)
                curveTo(3.8795f, 8.6583f, 3.0325f, 8.7493f, 2.5332f, 9.2745f)
                curveTo(2.3658f, 9.4505f, 2.23f, 9.6566f, 2.1323f, 9.8828f)
                curveTo(1.8407f, 10.5577f, 2.061f, 11.4171f, 2.5016f, 13.136f)
                lineTo(3.3467f, 16.4334f)
                curveTo(4.3402f, 20.3093f, 7.6433f, 21.5286f, 9.8629f, 21.9058f)
                curveTo(10.5401f, 22.0208f, 10.8787f, 22.0784f, 11.907f, 21.7903f)
                curveTo(12.9353f, 21.5023f, 13.201f, 21.2755f, 13.7324f, 20.8219f)
                curveTo(15.4742f, 19.335f, 17.7517f, 16.5526f, 16.7582f, 12.6766f)
                close()
                moveTo(6.0053f, 13.368f)
                curveTo(6.034f, 13.072f, 6.2643f, 12.7673f, 6.643f, 12.6658f)
                curveTo(7.0217f, 12.5643f, 7.3734f, 12.7131f, 7.5464f, 12.9551f)
                curveTo(7.7871f, 13.2921f, 8.2556f, 13.3701f, 8.5926f, 13.1293f)
                curveTo(8.9296f, 12.8885f, 9.0076f, 12.4201f, 8.7668f, 12.0831f)
                curveTo(8.2164f, 11.3126f, 7.2139f, 10.9599f, 6.2548f, 11.2169f)
                curveTo(5.2957f, 11.4739f, 4.6038f, 12.2806f, 4.5123f, 13.223f)
                curveTo(4.4723f, 13.6353f, 4.7741f, 14.002f, 5.1863f, 14.042f)
                curveTo(5.5986f, 14.082f, 5.9653f, 13.7803f, 6.0053f, 13.368f)
                close()
                moveTo(11.8012f, 11.8148f)
                curveTo(11.8299f, 11.5187f, 12.0602f, 11.2141f, 12.4389f, 11.1126f)
                curveTo(12.8176f, 11.0111f, 13.1693f, 11.1598f, 13.3422f, 11.4018f)
                curveTo(13.583f, 11.7389f, 14.0515f, 11.8169f, 14.3885f, 11.5761f)
                curveTo(14.7255f, 11.3353f, 14.8035f, 10.8669f, 14.5627f, 10.5298f)
                curveTo(14.0123f, 9.7594f, 13.0098f, 9.4067f, 12.0507f, 9.6637f)
                curveTo(11.0915f, 9.9207f, 10.3997f, 10.7273f, 10.3082f, 11.6698f)
                curveTo(10.2682f, 12.0821f, 10.57f, 12.4488f, 10.9823f, 12.4888f)
                curveTo(11.3945f, 12.5288f, 11.7612f, 12.227f, 11.8012f, 11.8148f)
                close()
                moveTo(13.6472f, 15.6287f)
                curveTo(13.9798f, 15.8756f, 14.0493f, 16.3453f, 13.8024f, 16.6779f)
                curveTo(13.5579f, 17.0075f, 13.0945f, 17.0788f, 12.7625f, 16.84f)
                lineTo(12.7527f, 16.8337f)
                curveTo(12.7384f, 16.8247f, 12.7103f, 16.8077f, 12.6689f, 16.7864f)
                curveTo(12.586f, 16.7438f, 12.4511f, 16.6841f, 12.2677f, 16.6343f)
                curveTo(11.9061f, 16.536f, 11.3382f, 16.4711f, 10.582f, 16.6737f)
                curveTo(9.8258f, 16.8763f, 9.3665f, 17.2165f, 9.1024f, 17.4824f)
                curveTo(8.9685f, 17.6172f, 8.8815f, 17.7364f, 8.8311f, 17.8148f)
                curveTo(8.8059f, 17.8539f, 8.79f, 17.8826f, 8.7821f, 17.8976f)
                lineTo(8.7768f, 17.9079f)
                curveTo(8.6087f, 18.2807f, 8.1718f, 18.4507f, 7.7952f, 18.2876f)
                curveTo(7.4151f, 18.123f, 7.2404f, 17.6814f, 7.405f, 17.3013f)
                lineTo(8.0932f, 17.5994f)
                curveTo(7.405f, 17.3013f, 7.4057f, 17.2997f, 7.4057f, 17.2997f)
                lineTo(7.4064f, 17.298f)
                lineTo(7.4081f, 17.2943f)
                lineTo(7.412f, 17.2855f)
                lineTo(7.4226f, 17.2629f)
                curveTo(7.4308f, 17.2457f, 7.4415f, 17.2241f, 7.4549f, 17.1986f)
                curveTo(7.4818f, 17.1477f, 7.5195f, 17.0811f, 7.5697f, 17.003f)
                curveTo(7.6703f, 16.8468f, 7.8218f, 16.6433f, 8.0381f, 16.4254f)
                curveTo(8.4746f, 15.9859f, 9.1625f, 15.5011f, 10.1938f, 15.2248f)
                curveTo(11.225f, 14.9485f, 12.0632f, 15.0244f, 12.6609f, 15.1867f)
                curveTo(12.9572f, 15.2672f, 13.1902f, 15.3677f, 13.3554f, 15.4527f)
                curveTo(13.438f, 15.4953f, 13.5039f, 15.534f, 13.5526f, 15.5647f)
                curveTo(13.5769f, 15.5801f, 13.597f, 15.5934f, 13.6128f, 15.6043f)
                lineTo(13.6332f, 15.6186f)
                lineTo(13.641f, 15.6242f)
                lineTo(13.6443f, 15.6266f)
                lineTo(13.6458f, 15.6277f)
                lineTo(13.6472f, 15.6287f)
                close()
            }
        }
            .build()
        return _masks!!
    }

private var _masks: ImageVector? = null
