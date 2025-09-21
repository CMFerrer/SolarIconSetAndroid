package dev.chiksmedina.solar.bold.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FilesGroup

val FilesGroup.ZipFile: ImageVector
    get() {
        if (_zipFile != null) {
            return _zipFile!!
        }
        _zipFile = Builder(
            name = "ZipFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.1716f, 3.1716f)
                curveTo(3.0f, 4.3432f, 3.0f, 6.2288f, 3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 17.7712f, 3.0f, 19.6569f, 4.1716f, 20.8284f)
                curveTo(5.3432f, 22.0f, 7.2288f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 22.0f, 18.6569f, 22.0f, 19.8284f, 20.8284f)
                curveTo(21.0f, 19.6569f, 21.0f, 17.7712f, 21.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 6.2288f, 21.0f, 4.3432f, 19.8284f, 3.1716f)
                curveTo(18.6569f, 2.0f, 16.7712f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.5f)
                curveTo(13.9714f, 4.0f, 14.2071f, 4.0f, 14.3536f, 4.1465f)
                curveTo(14.5f, 4.2929f, 14.5f, 4.5286f, 14.5f, 5.0f)
                curveTo(14.5f, 5.4714f, 14.5f, 5.7071f, 14.3536f, 5.8535f)
                curveTo(14.2071f, 6.0f, 13.9714f, 6.0f, 13.5f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.5f)
                curveTo(13.9714f, 8.0f, 14.2071f, 8.0f, 14.3536f, 8.1465f)
                curveTo(14.5f, 8.2929f, 14.5f, 8.5286f, 14.5f, 9.0f)
                curveTo(14.5f, 9.4714f, 14.5f, 9.7071f, 14.3536f, 9.8535f)
                curveTo(14.2071f, 10.0f, 13.9714f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(13.0f)
                curveTo(12.5286f, 10.0f, 12.2929f, 10.0f, 12.1464f, 9.8535f)
                curveTo(12.0f, 9.7071f, 12.0f, 9.4714f, 12.0f, 9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.5f)
                curveTo(10.0286f, 8.0f, 9.7929f, 8.0f, 9.6465f, 7.8535f)
                curveTo(9.5f, 7.7071f, 9.5f, 7.4714f, 9.5f, 7.0f)
                curveTo(9.5f, 6.5286f, 9.5f, 6.2929f, 9.6465f, 6.1465f)
                curveTo(9.7929f, 6.0f, 10.0286f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.5f)
                curveTo(10.0286f, 4.0f, 9.7929f, 4.0f, 9.6465f, 3.8535f)
                curveTo(9.5f, 3.7071f, 9.5f, 3.4714f, 9.5f, 3.0f)
                verticalLineTo(2.0034f)
                curveTo(6.7061f, 2.0238f, 5.1763f, 2.1669f, 4.1716f, 3.1716f)
                close()
                moveTo(9.5f, 12.875f)
                verticalLineTo(13.0f)
                curveTo(9.5f, 14.3807f, 10.6193f, 15.5f, 12.0f, 15.5f)
                curveTo(13.3807f, 15.5f, 14.5f, 14.3807f, 14.5f, 13.0f)
                verticalLineTo(12.875f)
                curveTo(14.5f, 12.3918f, 14.1082f, 12.0f, 13.625f, 12.0f)
                horizontalLineTo(10.375f)
                curveTo(9.8918f, 12.0f, 9.5f, 12.3918f, 9.5f, 12.875f)
                close()
            }
        }
            .build()
        return _zipFile!!
    }

private var _zipFile: ImageVector? = null
