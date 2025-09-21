package dev.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.BookMinimalistic: ImageVector
    get() {
        if (_bookMinimalistic != null) {
            return _bookMinimalistic!!
        }
        _bookMinimalistic = Builder(
            name = "BookMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.426f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(19.9965f, 18.9296f, 19.9784f, 19.6228f, 19.8866f, 20.1706f)
                curveTo(19.7773f, 20.8228f, 19.5774f, 21.1682f, 19.2709f, 21.4142f)
                curveTo(18.9643f, 21.6602f, 18.5339f, 21.8206f, 17.7211f, 21.9083f)
                curveTo(16.8844f, 21.9986f, 15.7754f, 22.0f, 14.1854f, 22.0f)
                horizontalLineTo(9.7546f)
                curveTo(8.1646f, 22.0f, 7.0557f, 21.9986f, 6.219f, 21.9083f)
                curveTo(5.4062f, 21.8206f, 4.9757f, 21.6602f, 4.6692f, 21.4142f)
                curveTo(4.3626f, 21.1682f, 4.1627f, 20.8228f, 4.0534f, 20.1706f)
                curveTo(4.0452f, 20.1216f, 4.0376f, 20.0714f, 4.0305f, 20.02f)
                curveTo(3.9904f, 19.7288f, 3.9704f, 19.5831f, 4.097f, 19.2397f)
                curveTo(4.2235f, 18.8964f, 4.2784f, 18.8425f, 4.3881f, 18.7347f)
                curveTo(4.7135f, 18.4151f, 5.1598f, 18.1785f, 5.6732f, 18.0681f)
                curveTo(5.9635f, 18.0057f, 6.3424f, 18.0f, 7.426f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.7272f, 2.7333f)
                curveTo(5.0326f, 2.4253f, 5.4613f, 2.2246f, 6.271f, 2.1148f)
                curveTo(7.1045f, 2.0018f, 8.2092f, 2.0f, 9.7931f, 2.0f)
                horizontalLineTo(14.2069f)
                curveTo(15.7908f, 2.0f, 16.8955f, 2.0018f, 17.729f, 2.1148f)
                curveTo(18.5387f, 2.2246f, 18.9674f, 2.4253f, 19.2728f, 2.7333f)
                curveTo(19.5782f, 3.0413f, 19.7773f, 3.4737f, 19.8862f, 4.2902f)
                curveTo(19.9982f, 5.1307f, 20.0f, 6.2447f, 20.0f, 7.842f)
                lineTo(20.0f, 18.0f)
                horizontalLineTo(7.426f)
                curveTo(6.3424f, 18.0f, 5.9635f, 18.0057f, 5.6732f, 18.0681f)
                curveTo(5.1598f, 18.1785f, 4.7135f, 18.4151f, 4.3881f, 18.7347f)
                curveTo(4.2784f, 18.8425f, 4.2235f, 18.8964f, 4.097f, 19.2397f)
                curveTo(4.0244f, 19.4367f, 4.0f, 19.5687f, 4.0f, 19.7003f)
                verticalLineTo(7.842f)
                curveTo(4.0f, 6.2447f, 4.0018f, 5.1307f, 4.1138f, 4.2902f)
                curveTo(4.2227f, 3.4737f, 4.4218f, 3.0413f, 4.7272f, 2.7333f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.3103f, 16.2303f)
                curveTo(7.3221f, 16.2303f, 7.3338f, 16.2303f, 7.3456f, 16.2303f)
                lineTo(20.0f, 16.2303f)
                verticalLineTo(7.9767f)
                curveTo(20.0f, 6.3426f, 19.9982f, 5.2029f, 19.8862f, 4.343f)
                curveTo(19.7773f, 3.5077f, 19.5782f, 3.0653f, 19.2728f, 2.7502f)
                curveTo(18.9674f, 2.4352f, 18.5387f, 2.2297f, 17.729f, 2.1174f)
                curveTo(16.8955f, 2.0018f, 15.7908f, 2.0f, 14.2069f, 2.0f)
                horizontalLineTo(9.7931f)
                curveTo(8.7914f, 2.0f, 7.9813f, 2.0007f, 7.3103f, 2.0305f)
                verticalLineTo(16.2303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.6552f, 2.2396f)
                curveTo(5.2225f, 2.3586f, 4.9438f, 2.5269f, 4.7272f, 2.7504f)
                curveTo(4.4218f, 3.0655f, 4.2227f, 3.5079f, 4.1138f, 4.3432f)
                curveTo(4.0018f, 5.2031f, 4.0f, 6.3428f, 4.0f, 7.9769f)
                verticalLineTo(17.0f)
                curveTo(4.3887f, 16.7198f, 4.8267f, 16.5065f, 5.299f, 16.376f)
                curveTo(5.413f, 16.3445f, 5.531f, 16.3198f, 5.6552f, 16.3004f)
                verticalLineTo(2.2396f)
                close()
            }
        }
            .build()
        return _bookMinimalistic!!
    }

private var _bookMinimalistic: ImageVector? = null
