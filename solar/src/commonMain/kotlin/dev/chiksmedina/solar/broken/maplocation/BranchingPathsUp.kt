package dev.chiksmedina.solar.broken.maplocation

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
import dev.chiksmedina.solar.broken.MapLocationGroup

val MapLocationGroup.BranchingPathsUp: ImageVector
    get() {
        if (_branchingPathsUp != null) {
            return _branchingPathsUp!!
        }
        _branchingPathsUp = Builder(
            name = "BranchingPathsUp", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(18.5303f, 8.5303f)
                curveTo(18.8232f, 8.2374f, 18.8232f, 7.7626f, 18.5303f, 7.4697f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(17.0303f, 5.9697f)
                curveTo(16.7374f, 5.6768f, 16.2626f, 5.6768f, 15.9697f, 5.9697f)
                curveTo(15.6768f, 6.2626f, 15.6768f, 6.7374f, 15.9697f, 7.0303f)
                lineTo(17.0303f, 5.9697f)
                close()
                moveTo(15.9697f, 8.9697f)
                curveTo(15.6768f, 9.2626f, 15.6768f, 9.7374f, 15.9697f, 10.0303f)
                curveTo(16.2626f, 10.3232f, 16.7374f, 10.3232f, 17.0303f, 10.0303f)
                lineTo(15.9697f, 8.9697f)
                close()
                moveTo(12.75f, 18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(16.0f, 8.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.25f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.75f)
                close()
                moveTo(18.5303f, 7.4697f)
                lineTo(17.0303f, 5.9697f)
                lineTo(15.9697f, 7.0303f)
                lineTo(17.4697f, 8.5303f)
                lineTo(18.5303f, 7.4697f)
                close()
                moveTo(17.4697f, 7.4697f)
                lineTo(15.9697f, 8.9697f)
                lineTo(17.0303f, 10.0303f)
                lineTo(18.5303f, 8.5303f)
                lineTo(17.4697f, 7.4697f)
                close()
                moveTo(12.75f, 12.0f)
                curveTo(12.75f, 10.2051f, 14.2051f, 8.75f, 16.0f, 8.75f)
                verticalLineTo(7.25f)
                curveTo(13.3766f, 7.25f, 11.25f, 9.3766f, 11.25f, 12.0f)
                horizontalLineTo(12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(5.4697f, 7.4697f)
                curveTo(5.1768f, 7.7626f, 5.1768f, 8.2374f, 5.4697f, 8.5303f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(8.0303f, 7.0303f)
                curveTo(8.3232f, 6.7374f, 8.3232f, 6.2626f, 8.0303f, 5.9697f)
                curveTo(7.7374f, 5.6768f, 7.2626f, 5.6768f, 6.9697f, 5.9697f)
                lineTo(8.0303f, 7.0303f)
                close()
                moveTo(6.9697f, 10.0303f)
                curveTo(7.2626f, 10.3232f, 7.7374f, 10.3232f, 8.0303f, 10.0303f)
                curveTo(8.3232f, 9.7374f, 8.3232f, 9.2626f, 8.0303f, 8.9697f)
                lineTo(6.9697f, 10.0303f)
                close()
                moveTo(12.75f, 18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(8.0f, 7.25f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.75f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.25f)
                close()
                moveTo(6.5303f, 8.5303f)
                lineTo(8.0303f, 7.0303f)
                lineTo(6.9697f, 5.9697f)
                lineTo(5.4697f, 7.4697f)
                lineTo(6.5303f, 8.5303f)
                close()
                moveTo(5.4697f, 8.5303f)
                lineTo(6.9697f, 10.0303f)
                lineTo(8.0303f, 8.9697f)
                lineTo(6.5303f, 7.4697f)
                lineTo(5.4697f, 8.5303f)
                close()
                moveTo(12.75f, 12.0f)
                curveTo(12.75f, 9.3766f, 10.6234f, 7.25f, 8.0f, 7.25f)
                verticalLineTo(8.75f)
                curveTo(9.7949f, 8.75f, 11.25f, 10.2051f, 11.25f, 12.0f)
                horizontalLineTo(12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(21.5093f, 4.4382f, 21.8356f, 5.8066f, 21.9449f, 8.0f)
            }
        }
            .build()
        return _branchingPathsUp!!
    }

private var _branchingPathsUp: ImageVector? = null
