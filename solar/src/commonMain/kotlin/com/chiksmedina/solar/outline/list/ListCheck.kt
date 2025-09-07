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

val ListGroup.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(
            name = "ListCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.4613f, 12.9086f)
                curveTo(20.7879f, 13.1634f, 20.8461f, 13.6347f, 20.5914f, 13.9613f)
                lineTo(16.6914f, 18.9613f)
                curveTo(16.5522f, 19.1397f, 16.3399f, 19.2458f, 16.1136f, 19.2499f)
                curveTo(15.8873f, 19.254f, 15.6713f, 19.1557f, 15.5257f, 18.9824f)
                lineTo(13.4257f, 16.4824f)
                curveTo(13.1593f, 16.1652f, 13.2004f, 15.6921f, 13.5176f, 15.4257f)
                curveTo(13.8348f, 15.1593f, 14.3079f, 15.2004f, 14.5743f, 15.5176f)
                lineTo(16.0784f, 17.3082f)
                lineTo(19.4086f, 13.0387f)
                curveTo(19.6634f, 12.7121f, 20.1347f, 12.6539f, 20.4613f, 12.9086f)
                close()
                moveTo(2.25f, 14.0f)
                curveTo(2.25f, 13.5858f, 2.5858f, 13.25f, 3.0f, 13.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 13.25f, 10.75f, 13.5858f, 10.75f, 14.0f)
                curveTo(10.75f, 14.4142f, 10.4142f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 14.75f, 2.25f, 14.4142f, 2.25f, 14.0f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 17.5858f, 2.5858f, 17.25f, 3.0f, 17.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 17.25f, 10.75f, 17.5858f, 10.75f, 18.0f)
                curveTo(10.75f, 18.4142f, 10.4142f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 18.75f, 2.25f, 18.4142f, 2.25f, 18.0f)
                close()
            }
        }
            .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
