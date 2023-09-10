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

val ListGroup.ListArrowDownMinimalistic: ImageVector
    get() {
        if (_listArrowDownMinimalistic != null) {
            return _listArrowDownMinimalistic!!
        }
        _listArrowDownMinimalistic = Builder(
            name = "ListArrowDownMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
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
                moveTo(17.5f, 8.25f)
                curveTo(17.9142f, 8.25f, 18.25f, 8.5858f, 18.25f, 9.0f)
                verticalLineTo(15.1893f)
                lineTo(19.4697f, 13.9697f)
                curveTo(19.7626f, 13.6768f, 20.2374f, 13.6768f, 20.5303f, 13.9697f)
                curveTo(20.8232f, 14.2626f, 20.8232f, 14.7374f, 20.5303f, 15.0303f)
                lineTo(18.0303f, 17.5303f)
                curveTo(17.7374f, 17.8232f, 17.2626f, 17.8232f, 16.9697f, 17.5303f)
                lineTo(14.4697f, 15.0303f)
                curveTo(14.1768f, 14.7374f, 14.1768f, 14.2626f, 14.4697f, 13.9697f)
                curveTo(14.7626f, 13.6768f, 15.2374f, 13.6768f, 15.5303f, 13.9697f)
                lineTo(16.75f, 15.1893f)
                verticalLineTo(9.0f)
                curveTo(16.75f, 8.5858f, 17.0858f, 8.25f, 17.5f, 8.25f)
                close()
                moveTo(2.25f, 11.0f)
                curveTo(2.25f, 10.5858f, 2.5858f, 10.25f, 3.0f, 10.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 10.25f, 12.75f, 10.5858f, 12.75f, 11.0f)
                curveTo(12.75f, 11.4142f, 12.4142f, 11.75f, 12.0f, 11.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 11.75f, 2.25f, 11.4142f, 2.25f, 11.0f)
                close()
                moveTo(2.25f, 16.0f)
                curveTo(2.25f, 15.5858f, 2.5858f, 15.25f, 3.0f, 15.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 15.25f, 11.75f, 15.5858f, 11.75f, 16.0f)
                curveTo(11.75f, 16.4142f, 11.4142f, 16.75f, 11.0f, 16.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.75f, 2.25f, 16.4142f, 2.25f, 16.0f)
                close()
            }
        }
            .build()
        return _listArrowDownMinimalistic!!
    }

private var _listArrowDownMinimalistic: ImageVector? = null
