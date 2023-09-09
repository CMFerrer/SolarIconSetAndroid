package com.chiksmedina.solar.boldduotone.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ListGroup

public val ListGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(name = "Playlist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.875f, 14.1183f)
                curveTo(20.5288f, 15.0732f, 21.3558f, 15.5506f, 21.4772f, 16.2394f)
                curveTo(21.5076f, 16.4118f, 21.5076f, 16.5881f, 21.4772f, 16.7604f)
                curveTo(21.3558f, 17.4492f, 20.5288f, 17.9266f, 18.875f, 18.8815f)
                curveTo(17.2212f, 19.8363f, 16.3942f, 20.3137f, 15.737f, 20.0745f)
                curveTo(15.5725f, 20.0147f, 15.4199f, 19.9265f, 15.2858f, 19.814f)
                curveTo(14.75f, 19.3644f, 14.75f, 18.4096f, 14.75f, 16.4999f)
                curveTo(14.75f, 14.5902f, 14.75f, 13.6354f, 15.2858f, 13.1858f)
                curveTo(15.4199f, 13.0733f, 15.5725f, 12.9852f, 15.737f, 12.9253f)
                curveTo(16.3942f, 12.6861f, 17.2212f, 13.1635f, 18.875f, 14.1183f)
                close()
            }
        }
        .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
