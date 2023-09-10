package com.chiksmedina.solar.bold.list

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
import com.chiksmedina.solar.bold.ListGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 5.25f, 21.75f, 5.5858f, 21.75f, 6.0f)
                curveTo(21.75f, 6.4142f, 21.4142f, 6.75f, 21.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 10.0f)
                curveTo(2.25f, 9.5858f, 2.5858f, 9.25f, 3.0f, 9.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 9.25f, 21.75f, 9.5858f, 21.75f, 10.0f)
                curveTo(21.75f, 10.4142f, 21.4142f, 10.75f, 21.0f, 10.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 10.75f, 2.25f, 10.4142f, 2.25f, 10.0f)
                close()
                moveTo(2.25f, 14.0f)
                curveTo(2.25f, 13.5858f, 2.5858f, 13.25f, 3.0f, 13.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 13.25f, 11.75f, 13.5858f, 11.75f, 14.0f)
                curveTo(11.75f, 14.4142f, 11.4142f, 14.75f, 11.0f, 14.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 14.75f, 2.25f, 14.4142f, 2.25f, 14.0f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 17.5858f, 2.5858f, 17.25f, 3.0f, 17.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 17.25f, 11.75f, 17.5858f, 11.75f, 18.0f)
                curveTo(11.75f, 18.4142f, 11.4142f, 18.75f, 11.0f, 18.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 18.75f, 2.25f, 18.4142f, 2.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.875f, 14.1184f)
                curveTo(20.5288f, 15.0733f, 21.3558f, 15.5507f, 21.4772f, 16.2395f)
                curveTo(21.5076f, 16.4118f, 21.5076f, 16.5882f, 21.4772f, 16.7605f)
                curveTo(21.3558f, 17.4493f, 20.5288f, 17.9267f, 18.875f, 18.8816f)
                curveTo(17.2212f, 19.8364f, 16.3942f, 20.3138f, 15.737f, 20.0746f)
                curveTo(15.5725f, 20.0148f, 15.4199f, 19.9266f, 15.2858f, 19.8141f)
                curveTo(14.75f, 19.3645f, 14.75f, 18.4097f, 14.75f, 16.5f)
                curveTo(14.75f, 14.5903f, 14.75f, 13.6355f, 15.2858f, 13.1859f)
                curveTo(15.4199f, 13.0734f, 15.5725f, 12.9852f, 15.737f, 12.9254f)
                curveTo(16.3942f, 12.6862f, 17.2212f, 13.1636f, 18.875f, 14.1184f)
                close()
            }
        }
            .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
