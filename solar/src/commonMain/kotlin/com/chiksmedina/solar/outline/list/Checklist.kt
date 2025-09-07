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

val ListGroup.Checklist: ImageVector
    get() {
        if (_checklist != null) {
            return _checklist!!
        }
        _checklist = Builder(
            name = "Checklist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0483f, 2.4883f)
                curveTo(8.3309f, 2.7911f, 8.3146f, 3.2657f, 8.0118f, 3.5483f)
                lineTo(3.726f, 7.5483f)
                curveTo(3.5739f, 7.6903f, 3.3697f, 7.7627f, 3.1621f, 7.7482f)
                curveTo(2.9545f, 7.7337f, 2.7623f, 7.6336f, 2.6314f, 7.4719f)
                lineTo(1.4171f, 5.9719f)
                curveTo(1.1565f, 5.65f, 1.2062f, 5.1777f, 1.5281f, 4.9171f)
                curveTo(1.8501f, 4.6564f, 2.3223f, 4.7062f, 2.583f, 5.0281f)
                lineTo(3.2909f, 5.9026f)
                lineTo(6.9883f, 2.4517f)
                curveTo(7.2911f, 2.1691f, 7.7657f, 2.1855f, 8.0483f, 2.4883f)
                close()
                moveTo(11.25f, 5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 4.25f, 22.75f, 4.5858f, 22.75f, 5.0f)
                curveTo(22.75f, 5.4142f, 22.4142f, 5.75f, 22.0f, 5.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                close()
                moveTo(8.0483f, 9.4883f)
                curveTo(8.3309f, 9.7911f, 8.3146f, 10.2657f, 8.0118f, 10.5483f)
                lineTo(3.726f, 14.5483f)
                curveTo(3.5739f, 14.6903f, 3.3697f, 14.7627f, 3.1621f, 14.7482f)
                curveTo(2.9545f, 14.7337f, 2.7623f, 14.6336f, 2.6314f, 14.4719f)
                lineTo(1.4171f, 12.9719f)
                curveTo(1.1565f, 12.65f, 1.2062f, 12.1777f, 1.5281f, 11.9171f)
                curveTo(1.8501f, 11.6564f, 2.3223f, 11.7062f, 2.583f, 12.0281f)
                lineTo(3.2909f, 12.9026f)
                lineTo(6.9883f, 9.4517f)
                curveTo(7.2911f, 9.1691f, 7.7657f, 9.1854f, 8.0483f, 9.4883f)
                close()
                moveTo(11.25f, 12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 12.75f, 11.25f, 12.4142f, 11.25f, 12.0f)
                close()
                moveTo(8.0483f, 16.4883f)
                curveTo(8.3309f, 16.7911f, 8.3146f, 17.2657f, 8.0118f, 17.5483f)
                lineTo(3.726f, 21.5483f)
                curveTo(3.5739f, 21.6903f, 3.3697f, 21.7627f, 3.1621f, 21.7482f)
                curveTo(2.9545f, 21.7337f, 2.7623f, 21.6336f, 2.6314f, 21.4719f)
                lineTo(1.4171f, 19.9719f)
                curveTo(1.1565f, 19.65f, 1.2062f, 19.1777f, 1.5281f, 18.9171f)
                curveTo(1.8501f, 18.6564f, 2.3223f, 18.7062f, 2.583f, 19.0281f)
                lineTo(3.2909f, 19.9026f)
                lineTo(6.9883f, 16.4517f)
                curveTo(7.2911f, 16.1691f, 7.7657f, 16.1855f, 8.0483f, 16.4883f)
                close()
                moveTo(11.25f, 19.0f)
                curveTo(11.25f, 18.5858f, 11.5858f, 18.25f, 12.0f, 18.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 18.25f, 22.75f, 18.5858f, 22.75f, 19.0f)
                curveTo(22.75f, 19.4142f, 22.4142f, 19.75f, 22.0f, 19.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 19.75f, 11.25f, 19.4142f, 11.25f, 19.0f)
                close()
            }
        }
            .build()
        return _checklist!!
    }

private var _checklist: ImageVector? = null
