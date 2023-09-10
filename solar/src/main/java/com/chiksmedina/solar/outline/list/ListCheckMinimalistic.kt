package com.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ListGroup

val ListGroup.ListCheckMinimalistic: ImageVector
    get() {
        if (_listCheckMinimalistic != null) {
            return _listCheckMinimalistic!!
        }
        _listCheckMinimalistic = Builder(
            name = "ListCheckMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 5.25f, 20.75f, 5.5858f, 20.75f, 6.0f)
                curveTo(20.75f, 6.4142f, 20.4142f, 6.75f, 20.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(20.4613f, 10.4086f)
                curveTo(20.7879f, 10.6634f, 20.8461f, 11.1347f, 20.5914f, 11.4613f)
                lineTo(16.6914f, 16.4613f)
                curveTo(16.5522f, 16.6397f, 16.3399f, 16.7458f, 16.1136f, 16.7499f)
                curveTo(15.8873f, 16.754f, 15.6713f, 16.6557f, 15.5257f, 16.4824f)
                lineTo(13.4257f, 13.9824f)
                curveTo(13.1593f, 13.6652f, 13.2004f, 13.1921f, 13.5176f, 12.9257f)
                curveTo(13.8348f, 12.6593f, 14.3079f, 12.7004f, 14.5743f, 13.0176f)
                lineTo(16.0784f, 14.8082f)
                lineTo(19.4086f, 10.5387f)
                curveTo(19.6634f, 10.2121f, 20.1347f, 10.1539f, 20.4613f, 10.4086f)
                close()
                moveTo(2.25f, 11.0f)
                curveTo(2.25f, 10.5858f, 2.5858f, 10.25f, 3.0f, 10.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 10.25f, 10.75f, 10.5858f, 10.75f, 11.0f)
                curveTo(10.75f, 11.4142f, 10.4142f, 11.75f, 10.0f, 11.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 11.75f, 2.25f, 11.4142f, 2.25f, 11.0f)
                close()
                moveTo(2.25f, 16.0f)
                curveTo(2.25f, 15.5858f, 2.5858f, 15.25f, 3.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.75f, 2.25f, 16.4142f, 2.25f, 16.0f)
                close()
            }
        }
            .build()
        return _listCheckMinimalistic!!
    }

private var _listCheckMinimalistic: ImageVector? = null
