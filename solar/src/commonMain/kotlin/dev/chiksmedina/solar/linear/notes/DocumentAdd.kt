package dev.chiksmedina.solar.linear.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.NotesGroup

val NotesGroup.DocumentAdd: ImageVector
    get() {
        if (_documentAdd != null) {
            return _documentAdd!!
        }
        _documentAdd = Builder(
            name = "DocumentAdd", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.18f, 8.0393f)
                lineTo(18.6435f, 7.5759f)
                curveTo(19.4113f, 6.808f, 20.6563f, 6.808f, 21.4241f, 7.5759f)
                curveTo(22.192f, 8.3437f, 22.192f, 9.5887f, 21.4241f, 10.3565f)
                lineTo(20.9607f, 10.82f)
                moveTo(18.18f, 8.0393f)
                curveTo(18.18f, 8.0393f, 18.238f, 9.0241f, 19.1069f, 9.8931f)
                curveTo(19.9759f, 10.762f, 20.9607f, 10.82f, 20.9607f, 10.82f)
                moveTo(18.18f, 8.0393f)
                lineTo(13.9194f, 12.2999f)
                curveTo(13.6308f, 12.5885f, 13.4865f, 12.7328f, 13.3624f, 12.8919f)
                curveTo(13.2161f, 13.0796f, 13.0906f, 13.2827f, 12.9882f, 13.4975f)
                curveTo(12.9014f, 13.6797f, 12.8368f, 13.8732f, 12.7078f, 14.2604f)
                lineTo(12.2946f, 15.5f)
                lineTo(12.1609f, 15.901f)
                moveTo(20.9607f, 10.82f)
                lineTo(16.7001f, 15.0806f)
                curveTo(16.4115f, 15.3692f, 16.2672f, 15.5135f, 16.1081f, 15.6376f)
                curveTo(15.9204f, 15.7839f, 15.7173f, 15.9094f, 15.5025f, 16.0118f)
                curveTo(15.3203f, 16.0986f, 15.1268f, 16.1632f, 14.7396f, 16.2922f)
                lineTo(13.5f, 16.7054f)
                lineTo(13.099f, 16.8391f)
                moveTo(13.099f, 16.8391f)
                lineTo(12.6979f, 16.9728f)
                curveTo(12.5074f, 17.0363f, 12.2973f, 16.9867f, 12.1553f, 16.8447f)
                curveTo(12.0133f, 16.7027f, 11.9637f, 16.4926f, 12.0272f, 16.3021f)
                lineTo(12.1609f, 15.901f)
                moveTo(13.099f, 16.8391f)
                lineTo(12.1609f, 15.901f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.0f)
                horizontalLineTo(10.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 9.0f)
                horizontalLineTo(14.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 17.0f)
                horizontalLineTo(9.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.8284f, 3.1716f)
                curveTo(18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 2.0f, 5.3432f, 2.0f, 4.1716f, 3.1716f)
                curveTo(3.0f, 4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 17.7712f, 3.0f, 19.6569f, 4.1716f, 20.8284f)
                curveTo(5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 22.0f, 18.6569f, 22.0f, 19.8284f, 20.8284f)
                curveTo(20.7715f, 19.8853f, 20.9554f, 18.4796f, 20.9913f, 16.0f)
            }
        }
            .build()
        return _documentAdd!!
    }

private var _documentAdd: ImageVector? = null
