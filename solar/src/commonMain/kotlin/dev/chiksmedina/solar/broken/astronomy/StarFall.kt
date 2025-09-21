package dev.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.StarFall: ImageVector
    get() {
        if (_starFall != null) {
            return _starFall!!
        }
        _starFall = Builder(
            name = "StarFall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.6097f, 5.8602f)
                curveTo(8.2452f, 6.4054f, 7.563f, 6.678f, 7.4807f, 7.2432f)
                curveTo(7.3984f, 7.8085f, 7.9705f, 8.292f, 9.1147f, 9.2591f)
                lineTo(9.4107f, 9.5093f)
                curveTo(9.7358f, 9.7842f, 9.8984f, 9.9216f, 9.9916f, 10.1089f)
                curveTo(10.0848f, 10.2962f, 10.0981f, 10.5121f, 10.1246f, 10.9441f)
                lineTo(10.1488f, 11.3373f)
                curveTo(10.2421f, 12.8574f, 10.2888f, 13.6174f, 10.7828f, 13.8794f)
                curveTo(11.2768f, 14.1414f, 11.8909f, 13.7319f, 13.1191f, 12.9129f)
                lineTo(13.4368f, 12.701f)
                curveTo(13.7858f, 12.4683f, 13.9603f, 12.3519f, 14.1599f, 12.32f)
                curveTo(14.3595f, 12.288f, 14.5616f, 12.344f, 14.9657f, 12.456f)
                lineTo(15.3336f, 12.558f)
                curveTo(16.7558f, 12.9522f, 17.4669f, 13.1493f, 17.8545f, 12.746f)
                curveTo(18.2421f, 12.3427f, 18.0495f, 11.6061f, 17.6644f, 10.1328f)
                moveTo(17.999f, 7.8352f)
                curveTo(18.7845f, 6.5588f, 19.1773f, 5.9206f, 18.9229f, 5.4093f)
                curveTo(18.6685f, 4.8981f, 17.9354f, 4.8523f, 16.4691f, 4.7608f)
                lineTo(16.0898f, 4.7371f)
                curveTo(15.6731f, 4.7111f, 15.4648f, 4.6981f, 15.2839f, 4.6021f)
                curveTo(15.1029f, 4.5061f, 14.9698f, 4.338f, 14.7037f, 4.0018f)
                lineTo(14.4614f, 3.6957f)
                curveTo(13.5247f, 2.5127f, 13.0564f, 1.9211f, 12.5115f, 2.0085f)
                curveTo(11.9667f, 2.0958f, 11.7062f, 2.8041f, 11.1851f, 4.2208f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.4465f, 7.2412f)
                curveTo(5.1114f, 8.9492f, 3.3237f, 12.2158f, 4.2484f, 18.0004f)
                curveTo(5.067f, 15.5892f, 7.5345f, 13.6579f, 10.2908f, 12.7283f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.2808f, 16.0f)
                curveTo(10.2808f, 16.0f, 10.9135f, 17.3908f, 11.6935f, 17.8692f)
                curveTo(12.4735f, 18.3475f, 14.0f, 18.2808f, 14.0f, 18.2808f)
                curveTo(14.0f, 18.2808f, 12.6092f, 18.9135f, 12.1308f, 19.6935f)
                curveTo(11.6525f, 20.4735f, 11.7192f, 22.0f, 11.7192f, 22.0f)
                curveTo(11.7192f, 22.0f, 11.0865f, 20.6092f, 10.3065f, 20.1308f)
                curveTo(9.5265f, 19.6525f, 8.0f, 19.7192f, 8.0f, 19.7192f)
                curveTo(8.0f, 19.7192f, 9.3908f, 19.0865f, 9.8692f, 18.3065f)
                curveTo(10.3475f, 17.5265f, 10.2808f, 16.0f, 10.2808f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.4795f, 15.0f)
                curveTo(18.4795f, 15.0f, 18.0577f, 15.9272f, 17.5377f, 16.2461f)
                curveTo(17.0177f, 16.565f, 16.0f, 16.5205f, 16.0f, 16.5205f)
                curveTo(16.0f, 16.5205f, 16.9272f, 16.9423f, 17.2461f, 17.4623f)
                curveTo(17.565f, 17.9823f, 17.5205f, 19.0f, 17.5205f, 19.0f)
                curveTo(17.5205f, 19.0f, 17.9423f, 18.0728f, 18.4623f, 17.7539f)
                curveTo(18.9823f, 17.435f, 20.0f, 17.4795f, 20.0f, 17.4795f)
                curveTo(20.0f, 17.4795f, 19.0728f, 17.0577f, 18.7539f, 16.5377f)
                curveTo(18.435f, 16.0177f, 18.4795f, 15.0f, 18.4795f, 15.0f)
                close()
            }
        }
            .build()
        return _starFall!!
    }

private var _starFall: ImageVector? = null
