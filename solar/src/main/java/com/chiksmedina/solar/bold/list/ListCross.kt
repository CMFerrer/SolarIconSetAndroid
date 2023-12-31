package com.chiksmedina.solar.bold.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ListGroup

val ListGroup.ListCross: ImageVector
    get() {
        if (_listCross != null) {
            return _listCross!!
        }
        _listCross = Builder(
            name = "ListCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(14.4697f, 12.9697f)
                curveTo(14.7626f, 12.6768f, 15.2374f, 12.6768f, 15.5303f, 12.9697f)
                lineTo(17.5f, 14.9393f)
                lineTo(19.4697f, 12.9697f)
                curveTo(19.7626f, 12.6768f, 20.2374f, 12.6768f, 20.5303f, 12.9697f)
                curveTo(20.8232f, 13.2626f, 20.8232f, 13.7374f, 20.5303f, 14.0303f)
                lineTo(18.5607f, 16.0f)
                lineTo(20.5303f, 17.9697f)
                curveTo(20.8232f, 18.2626f, 20.8232f, 18.7374f, 20.5303f, 19.0303f)
                curveTo(20.2374f, 19.3232f, 19.7626f, 19.3232f, 19.4697f, 19.0303f)
                lineTo(17.5f, 17.0607f)
                lineTo(15.5303f, 19.0303f)
                curveTo(15.2374f, 19.3232f, 14.7626f, 19.3232f, 14.4697f, 19.0303f)
                curveTo(14.1768f, 18.7374f, 14.1768f, 18.2626f, 14.4697f, 17.9697f)
                lineTo(16.4393f, 16.0f)
                lineTo(14.4697f, 14.0303f)
                curveTo(14.1768f, 13.7374f, 14.1768f, 13.2626f, 14.4697f, 12.9697f)
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
        }
            .build()
        return _listCross!!
    }

private var _listCross: ImageVector? = null
