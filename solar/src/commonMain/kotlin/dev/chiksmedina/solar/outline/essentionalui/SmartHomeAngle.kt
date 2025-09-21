package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.SmartHomeAngle: ImageVector
    get() {
        if (_smartHomeAngle != null) {
            return _smartHomeAngle!!
        }
        _smartHomeAngle = Builder(
            name = "SmartHomeAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0955f, 4.5115f)
                curveTo(9.153f, 3.8815f, 9.8991f, 3.4381f, 10.5236f, 3.1466f)
                curveTo(11.1327f, 2.8623f, 11.5706f, 2.7502f, 11.9999f, 2.7502f)
                curveTo(12.4291f, 2.7502f, 12.8671f, 2.8623f, 13.4762f, 3.1466f)
                curveTo(14.1007f, 3.4381f, 14.8468f, 3.8815f, 15.9043f, 4.5114f)
                lineTo(17.2891f, 5.3364f)
                curveTo(18.4535f, 6.03f, 19.2751f, 6.5206f, 19.878f, 6.9741f)
                curveTo(20.4664f, 7.4169f, 20.7887f, 7.7832f, 20.9882f, 8.1994f)
                curveTo(21.1876f, 8.6153f, 21.2705f, 9.0936f, 21.2456f, 9.8249f)
                curveTo(21.22f, 10.5748f, 21.0855f, 11.5166f, 20.8935f, 12.8513f)
                lineTo(20.6147f, 14.7887f)
                curveTo(20.3682f, 16.5018f, 20.192f, 17.7165f, 19.9389f, 18.6332f)
                curveTo(19.6915f, 19.5291f, 19.3938f, 20.0479f, 18.9615f, 20.4201f)
                curveTo(18.5669f, 20.7598f, 18.0667f, 20.972f, 17.2808f, 21.0953f)
                curveTo(16.4752f, 21.2217f, 15.4368f, 21.2457f, 13.9979f, 21.2495f)
                curveTo(13.5837f, 21.2506f, 13.2488f, 21.5873f, 13.2499f, 22.0015f)
                curveTo(13.251f, 22.4157f, 13.5877f, 22.7506f, 14.0019f, 22.7495f)
                curveTo(15.4229f, 22.7457f, 16.5757f, 22.7243f, 17.5133f, 22.5772f)
                curveTo(18.4708f, 22.4269f, 19.266f, 22.1373f, 19.9402f, 21.5568f)
                curveTo(20.683f, 20.9172f, 21.0947f, 20.0832f, 21.3848f, 19.0324f)
                curveTo(21.6662f, 18.0131f, 21.8546f, 16.7038f, 22.092f, 15.054f)
                lineTo(22.3843f, 13.0222f)
                curveTo(22.5688f, 11.7399f, 22.716f, 10.7173f, 22.7447f, 9.8761f)
                curveTo(22.7744f, 9.007f, 22.6819f, 8.2624f, 22.3408f, 7.551f)
                curveTo(21.9999f, 6.8398f, 21.4768f, 6.2999f, 20.7797f, 5.7755f)
                curveTo(20.1045f, 5.2675f, 19.2128f, 4.7363f, 18.0937f, 4.0697f)
                lineTo(16.6381f, 3.2026f)
                curveTo(15.6222f, 2.5974f, 14.8116f, 2.1145f, 14.1106f, 1.7874f)
                curveTo(13.3865f, 1.4494f, 12.725f, 1.2502f, 11.9999f, 1.2502f)
                curveTo(11.2748f, 1.2502f, 10.6133f, 1.4494f, 9.8892f, 1.7874f)
                curveTo(9.1882f, 2.1145f, 8.3776f, 2.5974f, 7.3617f, 3.2026f)
                lineTo(5.9061f, 4.0697f)
                curveTo(4.787f, 4.7363f, 3.8952f, 5.2675f, 3.22f, 5.7755f)
                curveTo(2.523f, 6.2999f, 1.9999f, 6.8398f, 1.659f, 7.551f)
                curveTo(1.2968f, 8.3065f, 1.215f, 9.0994f, 1.2619f, 10.0377f)
                curveTo(1.2826f, 10.4514f, 1.6347f, 10.77f, 2.0484f, 10.7493f)
                curveTo(2.4621f, 10.7286f, 2.7807f, 10.3765f, 2.76f, 9.9628f)
                curveTo(2.7195f, 9.152f, 2.8001f, 8.6406f, 3.0116f, 8.1994f)
                curveTo(3.2111f, 7.7832f, 3.5334f, 7.4169f, 4.1218f, 6.9742f)
                curveTo(4.7247f, 6.5206f, 5.5463f, 6.03f, 6.7106f, 5.3364f)
                lineTo(8.0955f, 4.5115f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.25f)
                curveTo(1.5858f, 12.25f, 1.25f, 12.5858f, 1.25f, 13.0f)
                curveTo(1.25f, 13.4142f, 1.5858f, 13.75f, 2.0f, 13.75f)
                curveTo(6.5563f, 13.75f, 10.25f, 17.4437f, 10.25f, 22.0f)
                curveTo(10.25f, 22.4142f, 10.5858f, 22.75f, 11.0f, 22.75f)
                curveTo(11.4142f, 22.75f, 11.75f, 22.4142f, 11.75f, 22.0f)
                curveTo(11.75f, 16.6153f, 7.3848f, 12.25f, 2.0f, 12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(1.25f, 16.0f)
                curveTo(1.25f, 15.5858f, 1.5858f, 15.25f, 2.0f, 15.25f)
                curveTo(5.7279f, 15.25f, 8.75f, 18.2721f, 8.75f, 22.0f)
                curveTo(8.75f, 22.4142f, 8.4142f, 22.75f, 8.0f, 22.75f)
                curveTo(7.5858f, 22.75f, 7.25f, 22.4142f, 7.25f, 22.0f)
                curveTo(7.25f, 19.1005f, 4.8995f, 16.75f, 2.0f, 16.75f)
                curveTo(1.5858f, 16.75f, 1.25f, 16.4142f, 1.25f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 18.25f)
                curveTo(1.5858f, 18.25f, 1.25f, 18.5858f, 1.25f, 19.0f)
                curveTo(1.25f, 19.4142f, 1.5858f, 19.75f, 2.0f, 19.75f)
                curveTo(3.2426f, 19.75f, 4.25f, 20.7574f, 4.25f, 22.0f)
                curveTo(4.25f, 22.4142f, 4.5858f, 22.75f, 5.0f, 22.75f)
                curveTo(5.4142f, 22.75f, 5.75f, 22.4142f, 5.75f, 22.0f)
                curveTo(5.75f, 19.929f, 4.0711f, 18.25f, 2.0f, 18.25f)
                close()
            }
        }
            .build()
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: ImageVector? = null
