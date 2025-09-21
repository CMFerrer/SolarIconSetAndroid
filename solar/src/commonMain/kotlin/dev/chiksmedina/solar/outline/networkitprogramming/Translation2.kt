package dev.chiksmedina.solar.outline.networkitprogramming

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
import dev.chiksmedina.solar.outline.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Translation2: ImageVector
    get() {
        if (_translation2 != null) {
            return _translation2!!
        }
        _translation2 = Builder(
            name = "Translation2", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 14.5545f, 20.2155f, 16.866f, 18.5407f, 18.5407f)
                curveTo(18.2478f, 18.8336f, 18.2478f, 19.3085f, 18.5407f, 19.6014f)
                curveTo(18.8336f, 19.8943f, 19.3085f, 19.8943f, 19.6014f, 19.6014f)
                curveTo(21.5459f, 17.6569f, 22.75f, 14.9683f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 14.9683f, 2.4541f, 17.6569f, 4.3986f, 19.6014f)
                curveTo(4.6915f, 19.8943f, 5.1664f, 19.8943f, 5.4593f, 19.6014f)
                curveTo(5.7522f, 19.3085f, 5.7522f, 18.8336f, 5.4593f, 18.5407f)
                curveTo(3.7845f, 16.866f, 2.75f, 14.5545f, 2.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 9.1005f, 9.1005f, 6.75f, 12.0f, 6.75f)
                curveTo(14.8995f, 6.75f, 17.25f, 9.1005f, 17.25f, 12.0f)
                curveTo(17.25f, 13.45f, 16.6632f, 14.7614f, 15.7123f, 15.7123f)
                curveTo(15.4194f, 16.0052f, 15.4194f, 16.4801f, 15.7123f, 16.773f)
                curveTo(16.0052f, 17.0659f, 16.4801f, 17.0659f, 16.773f, 16.773f)
                curveTo(17.9937f, 15.5523f, 18.75f, 13.8638f, 18.75f, 12.0f)
                curveTo(18.75f, 8.2721f, 15.7279f, 5.25f, 12.0f, 5.25f)
                curveTo(8.2721f, 5.25f, 5.25f, 8.2721f, 5.25f, 12.0f)
                curveTo(5.25f, 13.8638f, 6.0063f, 15.5523f, 7.227f, 16.773f)
                curveTo(7.5199f, 17.0659f, 7.9948f, 17.0659f, 8.2877f, 16.773f)
                curveTo(8.5806f, 16.4801f, 8.5806f, 16.0052f, 8.2877f, 15.7123f)
                curveTo(7.3368f, 14.7614f, 6.75f, 13.45f, 6.75f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 10.4812f, 10.4812f, 9.25f, 12.0f, 9.25f)
                curveTo(13.5188f, 9.25f, 14.75f, 10.4812f, 14.75f, 12.0f)
                curveTo(14.75f, 13.5188f, 13.5188f, 14.75f, 12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                close()
                moveTo(12.0f, 10.75f)
                curveTo(11.3096f, 10.75f, 10.75f, 11.3096f, 10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                curveTo(12.6904f, 13.25f, 13.25f, 12.6904f, 13.25f, 12.0f)
                curveTo(13.25f, 11.3096f, 12.6904f, 10.75f, 12.0f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.393f, 15.7434f)
                curveTo(13.0153f, 15.4757f, 12.6097f, 15.2765f, 12.1173f, 15.2528f)
                curveTo(12.0392f, 15.2491f, 11.9608f, 15.2491f, 11.8827f, 15.2528f)
                curveTo(11.3903f, 15.2765f, 10.9847f, 15.4757f, 10.607f, 15.7434f)
                curveTo(10.255f, 15.993f, 9.8661f, 16.3479f, 9.4145f, 16.7602f)
                lineTo(9.3359f, 16.832f)
                curveTo(8.331f, 17.7493f, 7.5184f, 18.4911f, 7.0006f, 19.1089f)
                curveTo(6.5036f, 19.702f, 6.0468f, 20.4464f, 6.3416f, 21.2757f)
                curveTo(6.381f, 21.3864f, 6.4296f, 21.4935f, 6.4869f, 21.5959f)
                curveTo(6.8976f, 22.331f, 7.7323f, 22.5508f, 8.5346f, 22.6483f)
                curveTo(9.3717f, 22.75f, 10.5153f, 22.75f, 11.9436f, 22.75f)
                horizontalLineTo(12.0563f)
                curveTo(13.4847f, 22.75f, 14.6283f, 22.75f, 15.4654f, 22.6483f)
                curveTo(16.2676f, 22.5508f, 17.1024f, 22.331f, 17.5131f, 21.5959f)
                curveTo(17.5704f, 21.4935f, 17.619f, 21.3864f, 17.6584f, 21.2757f)
                curveTo(17.9532f, 20.4464f, 17.4964f, 19.702f, 16.9994f, 19.1089f)
                curveTo(16.4816f, 18.4911f, 15.669f, 17.7493f, 14.6641f, 16.832f)
                lineTo(14.5854f, 16.7602f)
                curveTo(14.1338f, 16.3479f, 13.745f, 15.993f, 13.393f, 15.7434f)
                close()
                moveTo(11.4744f, 16.9671f)
                curveTo(11.7245f, 16.7899f, 11.8549f, 16.7559f, 11.9547f, 16.7511f)
                curveTo(11.9849f, 16.7496f, 12.0151f, 16.7496f, 12.0453f, 16.7511f)
                curveTo(12.1451f, 16.7559f, 12.2755f, 16.7899f, 12.5256f, 16.9671f)
                curveTo(12.7928f, 17.1566f, 13.1132f, 17.4473f, 13.607f, 17.898f)
                curveTo(14.6685f, 18.867f, 15.4046f, 19.5412f, 15.8497f, 20.0724f)
                curveTo(16.0699f, 20.3352f, 16.1778f, 20.5162f, 16.224f, 20.6375f)
                curveTo(16.2605f, 20.7334f, 16.249f, 20.7631f, 16.2455f, 20.772f)
                lineTo(16.245f, 20.7733f)
                curveTo(16.2341f, 20.804f, 16.2204f, 20.8344f, 16.2037f, 20.8643f)
                curveTo(16.1842f, 20.8991f, 16.0659f, 21.0643f, 15.2845f, 21.1592f)
                curveTo(14.549f, 21.2486f, 13.4975f, 21.25f, 12.0f, 21.25f)
                curveTo(10.5025f, 21.25f, 9.451f, 21.2486f, 8.7155f, 21.1592f)
                curveTo(7.9341f, 21.0643f, 7.8158f, 20.8991f, 7.7964f, 20.8643f)
                curveTo(7.7796f, 20.8344f, 7.7659f, 20.804f, 7.755f, 20.7733f)
                lineTo(7.7545f, 20.772f)
                curveTo(7.751f, 20.7631f, 7.7395f, 20.7334f, 7.776f, 20.6375f)
                curveTo(7.8222f, 20.5162f, 7.9301f, 20.3352f, 8.1503f, 20.0724f)
                curveTo(8.5954f, 19.5412f, 9.3315f, 18.867f, 10.393f, 17.898f)
                curveTo(10.8868f, 17.4473f, 11.2072f, 17.1566f, 11.4744f, 16.9671f)
                close()
            }
        }
            .build()
        return _translation2!!
    }

private var _translation2: ImageVector? = null
