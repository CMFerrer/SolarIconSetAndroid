package dev.chiksmedina.solar.broken.list

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
import dev.chiksmedina.solar.broken.ListGroup

val ListGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(
            name = "Playlist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 14.0f)
                lineTo(3.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 18.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.875f, 14.1185f)
                curveTo(20.5288f, 15.0733f, 21.3558f, 15.5507f, 21.4772f, 16.2396f)
                curveTo(21.5076f, 16.4119f, 21.5076f, 16.5882f, 21.4772f, 16.7605f)
                curveTo(21.3558f, 17.4493f, 20.5288f, 17.9268f, 18.875f, 18.8816f)
                curveTo(17.2212f, 19.8365f, 16.3942f, 20.3139f, 15.737f, 20.0746f)
                curveTo(15.5725f, 20.0148f, 15.4199f, 19.9266f, 15.2858f, 19.8142f)
                curveTo(14.75f, 19.3646f, 14.75f, 18.4097f, 14.75f, 16.5f)
                curveTo(14.75f, 14.5904f, 14.75f, 13.6355f, 15.2858f, 13.1859f)
                curveTo(15.4199f, 13.0734f, 15.5725f, 12.9853f, 15.737f, 12.9254f)
                curveTo(16.3942f, 12.6862f, 17.2212f, 13.1636f, 18.875f, 14.1185f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 6.0f)
                lineTo(13.5f, 6.0f)
                moveTo(20.0f, 6.0f)
                lineTo(17.75f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.0f)
                lineTo(9.5f, 10.0f)
                moveTo(3.0f, 10.0f)
                horizontalLineTo(5.25f)
            }
        }
            .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
