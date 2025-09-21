package dev.chiksmedina.solar.outline.essentionalui

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
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(
            name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5061f, 5.2501f)
                curveTo(12.0919f, 5.2467f, 11.7534f, 5.5798f, 11.75f, 5.994f)
                curveTo(11.7467f, 6.4082f, 12.0797f, 6.7467f, 12.4939f, 6.75f)
                curveTo(13.7281f, 6.76f, 14.7401f, 7.772f, 14.75f, 9.0061f)
                curveTo(14.7534f, 9.4203f, 15.0919f, 9.7534f, 15.5061f, 9.75f)
                curveTo(15.9203f, 9.7467f, 16.2533f, 9.4082f, 16.25f, 8.994f)
                curveTo(16.2334f, 6.9409f, 14.5591f, 5.2666f, 12.5061f, 5.2501f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.8107f, 9.6852f)
                curveTo(3.7742f, 5.0139f, 7.4224f, 1.2121f, 12.0062f, 1.2503f)
                curveTo(16.5794f, 1.2884f, 20.2737f, 5.1355f, 20.3102f, 9.7984f)
                curveTo(20.3407f, 13.7063f, 17.6845f, 17.4318f, 14.0653f, 18.4671f)
                curveTo(14.107f, 18.5528f, 14.1422f, 18.6357f, 14.1669f, 18.7146f)
                curveTo(14.4991f, 19.7769f, 13.8107f, 20.8463f, 12.75f, 21.0618f)
                verticalLineTo(22.5f)
                curveTo(12.75f, 22.9142f, 12.4142f, 23.25f, 12.0f, 23.25f)
                curveTo(11.5858f, 23.25f, 11.25f, 22.9142f, 11.25f, 22.5f)
                verticalLineTo(21.0618f)
                curveTo(10.1893f, 20.8463f, 9.5008f, 19.7769f, 9.8331f, 18.7146f)
                curveTo(9.8605f, 18.6267f, 9.9011f, 18.534f, 9.9491f, 18.4378f)
                curveTo(6.3568f, 17.3478f, 3.841f, 13.5668f, 3.8107f, 9.6852f)
                close()
                moveTo(11.9937f, 2.7502f)
                curveTo(8.2934f, 2.7194f, 5.2803f, 5.7937f, 5.3106f, 9.6735f)
                curveTo(5.3417f, 13.6416f, 8.3686f, 17.2195f, 12.0062f, 17.2498f)
                curveTo(15.6606f, 17.2802f, 18.8409f, 13.7388f, 18.8102f, 9.8102f)
                curveTo(18.7798f, 5.922f, 15.7045f, 2.7811f, 11.9937f, 2.7502f)
                close()
                moveTo(11.9937f, 18.7498f)
                curveTo(12.1664f, 18.7512f, 12.338f, 18.7465f, 12.5081f, 18.7359f)
                curveTo(12.5161f, 18.7533f, 12.5249f, 18.7706f, 12.5344f, 18.7877f)
                lineTo(12.699f, 19.0883f)
                lineTo(12.7362f, 19.1652f)
                curveTo(12.7866f, 19.3328f, 12.6866f, 19.545f, 12.4497f, 19.5922f)
                curveTo(12.4497f, 19.5922f, 12.4268f, 19.5957f, 12.3535f, 19.5978f)
                lineTo(12.0f, 19.6002f)
                curveTo(11.8349f, 19.6002f, 11.7273f, 19.6001f, 11.6465f, 19.5978f)
                curveTo(11.5732f, 19.5957f, 11.5503f, 19.5922f, 11.5503f, 19.5922f)
                curveTo(11.3134f, 19.545f, 11.2136f, 19.3323f, 11.264f, 19.1647f)
                curveTo(11.2658f, 19.1604f, 11.2748f, 19.1387f, 11.3009f, 19.0883f)
                curveTo(11.3366f, 19.0194f, 11.3871f, 18.9286f, 11.4656f, 18.7877f)
                curveTo(11.4764f, 18.7682f, 11.4863f, 18.7485f, 11.4952f, 18.7286f)
                curveTo(11.6598f, 18.7412f, 11.826f, 18.7484f, 11.9937f, 18.7498f)
                close()
            }
        }
            .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
