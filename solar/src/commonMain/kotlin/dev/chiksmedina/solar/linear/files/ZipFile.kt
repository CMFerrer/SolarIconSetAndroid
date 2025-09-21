package dev.chiksmedina.solar.linear.files

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
import dev.chiksmedina.solar.linear.FilesGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(21.0f, 4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.7712f, 21.0f, 19.6569f, 19.8284f, 20.8284f)
                curveTo(18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 22.0f, 5.3432f, 22.0f, 4.1716f, 20.8284f)
                curveTo(3.0f, 19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 15.5f)
                verticalLineTo(15.375f)
                curveTo(9.5f, 14.8918f, 9.8918f, 14.5f, 10.375f, 14.5f)
                horizontalLineTo(13.625f)
                curveTo(14.1082f, 14.5f, 14.5f, 14.8918f, 14.5f, 15.375f)
                verticalLineTo(15.5f)
                curveTo(14.5f, 16.8807f, 13.3807f, 18.0f, 12.0f, 18.0f)
                curveTo(10.6193f, 18.0f, 9.5f, 16.8807f, 9.5f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 3.0f)
                curveTo(9.5f, 2.5286f, 9.5f, 2.2929f, 9.6465f, 2.1465f)
                curveTo(9.7929f, 2.0f, 10.0286f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(11.4714f, 2.0f, 11.7071f, 2.0f, 11.8536f, 2.1465f)
                curveTo(12.0f, 2.2929f, 12.0f, 2.5286f, 12.0f, 3.0f)
                verticalLineTo(3.5f)
                curveTo(12.0f, 3.9714f, 12.0f, 4.2071f, 11.8536f, 4.3535f)
                curveTo(11.7071f, 4.5f, 11.4714f, 4.5f, 11.0f, 4.5f)
                horizontalLineTo(10.5f)
                curveTo(10.0286f, 4.5f, 9.7929f, 4.5f, 9.6465f, 4.3535f)
                curveTo(9.5f, 4.2071f, 9.5f, 3.9714f, 9.5f, 3.5f)
                verticalLineTo(3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 8.0f)
                curveTo(9.5f, 7.5286f, 9.5f, 7.2929f, 9.6465f, 7.1465f)
                curveTo(9.7929f, 7.0f, 10.0286f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(11.4714f, 7.0f, 11.7071f, 7.0f, 11.8536f, 7.1465f)
                curveTo(12.0f, 7.2929f, 12.0f, 7.5286f, 12.0f, 8.0f)
                verticalLineTo(8.5f)
                curveTo(12.0f, 8.9714f, 12.0f, 9.2071f, 11.8536f, 9.3535f)
                curveTo(11.7071f, 9.5f, 11.4714f, 9.5f, 11.0f, 9.5f)
                horizontalLineTo(10.5f)
                curveTo(10.0286f, 9.5f, 9.7929f, 9.5f, 9.6465f, 9.3535f)
                curveTo(9.5f, 9.2071f, 9.5f, 8.9714f, 9.5f, 8.5f)
                verticalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.5f)
                curveTo(12.0f, 5.0286f, 12.0f, 4.7929f, 12.1464f, 4.6465f)
                curveTo(12.2929f, 4.5f, 12.5286f, 4.5f, 13.0f, 4.5f)
                horizontalLineTo(13.5f)
                curveTo(13.9714f, 4.5f, 14.2071f, 4.5f, 14.3536f, 4.6465f)
                curveTo(14.5f, 4.7929f, 14.5f, 5.0286f, 14.5f, 5.5f)
                verticalLineTo(6.0f)
                curveTo(14.5f, 6.4714f, 14.5f, 6.7071f, 14.3536f, 6.8535f)
                curveTo(14.2071f, 7.0f, 13.9714f, 7.0f, 13.5f, 7.0f)
                horizontalLineTo(13.0f)
                curveTo(12.5286f, 7.0f, 12.2929f, 7.0f, 12.1464f, 6.8535f)
                curveTo(12.0f, 6.7071f, 12.0f, 6.4714f, 12.0f, 6.0f)
                verticalLineTo(5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.5f)
                curveTo(12.0f, 10.0286f, 12.0f, 9.7929f, 12.1464f, 9.6465f)
                curveTo(12.2929f, 9.5f, 12.5286f, 9.5f, 13.0f, 9.5f)
                horizontalLineTo(13.5f)
                curveTo(13.9714f, 9.5f, 14.2071f, 9.5f, 14.3536f, 9.6465f)
                curveTo(14.5f, 9.7929f, 14.5f, 10.0286f, 14.5f, 10.5f)
                verticalLineTo(11.0f)
                curveTo(14.5f, 11.4714f, 14.5f, 11.7071f, 14.3536f, 11.8536f)
                curveTo(14.2071f, 12.0f, 13.9714f, 12.0f, 13.5f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(12.5286f, 12.0f, 12.2929f, 12.0f, 12.1464f, 11.8536f)
                curveTo(12.0f, 11.7071f, 12.0f, 11.4714f, 12.0f, 11.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
            .build()
        return _zipFile!!
    }

private var _zipFile: ImageVector? = null
