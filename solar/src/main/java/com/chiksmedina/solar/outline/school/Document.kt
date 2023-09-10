package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(
            name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6111f, 1.5838f)
                curveTo(17.2678f, 1.3471f, 18.75f, 2.6327f, 18.75f, 4.3062f)
                verticalLineTo(5.6827f)
                curveTo(19.9395f, 6.3114f, 20.75f, 7.5611f, 20.75f, 9.0002f)
                verticalLineTo(19.0002f)
                curveTo(20.75f, 21.0712f, 19.0711f, 22.7502f, 17.0f, 22.7502f)
                horizontalLineTo(7.0f)
                curveTo(4.9289f, 22.7502f, 3.25f, 21.0712f, 3.25f, 19.0002f)
                verticalLineTo(5.0002f)
                curveTo(3.25f, 4.9909f, 3.2502f, 4.9816f, 3.2505f, 4.9724f)
                curveTo(3.2502f, 4.958f, 3.25f, 4.9436f, 3.25f, 4.9291f)
                curveTo(3.25f, 4.0228f, 3.9164f, 3.2545f, 4.8135f, 3.1263f)
                lineTo(15.6111f, 1.5838f)
                close()
                moveTo(4.75f, 6.7502f)
                verticalLineTo(19.0002f)
                curveTo(4.75f, 20.2428f, 5.7574f, 21.2502f, 7.0f, 21.2502f)
                horizontalLineTo(17.0f)
                curveTo(18.2426f, 21.2502f, 19.25f, 20.2428f, 19.25f, 19.0002f)
                verticalLineTo(9.0002f)
                curveTo(19.25f, 7.7575f, 18.2426f, 6.7502f, 17.0f, 6.7502f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5.0711f, 5.2502f)
                horizontalLineTo(17.25f)
                verticalLineTo(4.3062f)
                curveTo(17.25f, 3.5455f, 16.5763f, 2.9612f, 15.8232f, 3.0687f)
                lineTo(5.0257f, 4.6112f)
                curveTo(4.8675f, 4.6339f, 4.75f, 4.7693f, 4.75f, 4.9291f)
                curveTo(4.75f, 5.1064f, 4.8938f, 5.2502f, 5.0711f, 5.2502f)
                close()
                moveTo(7.25f, 12.0002f)
                curveTo(7.25f, 11.5859f, 7.5858f, 11.2502f, 8.0f, 11.2502f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 11.2502f, 16.75f, 11.5859f, 16.75f, 12.0002f)
                curveTo(16.75f, 12.4144f, 16.4142f, 12.7502f, 16.0f, 12.7502f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 12.7502f, 7.25f, 12.4144f, 7.25f, 12.0002f)
                close()
                moveTo(7.25f, 15.5002f)
                curveTo(7.25f, 15.0859f, 7.5858f, 14.7502f, 8.0f, 14.7502f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.7502f, 14.25f, 15.0859f, 14.25f, 15.5002f)
                curveTo(14.25f, 15.9144f, 13.9142f, 16.2502f, 13.5f, 16.2502f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 16.2502f, 7.25f, 15.9144f, 7.25f, 15.5002f)
                close()
            }
        }
            .build()
        return _document!!
    }

private var _document: ImageVector? = null
