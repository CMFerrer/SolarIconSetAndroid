package dev.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 17.5f)
                curveTo(12.75f, 17.9142f, 12.4142f, 18.25f, 12.0f, 18.25f)
                curveTo(11.5858f, 18.25f, 11.25f, 17.9142f, 11.25f, 17.5f)
                verticalLineTo(11.5f)
                curveTo(11.25f, 9.7051f, 9.7949f, 8.25f, 8.0f, 8.25f)
                horizontalLineTo(7.8107f)
                lineTo(8.0303f, 8.4697f)
                curveTo(8.3232f, 8.7626f, 8.3232f, 9.2374f, 8.0303f, 9.5303f)
                curveTo(7.7374f, 9.8232f, 7.2626f, 9.8232f, 6.9697f, 9.5303f)
                lineTo(5.4697f, 8.0303f)
                curveTo(5.1768f, 7.7374f, 5.1768f, 7.2626f, 5.4697f, 6.9697f)
                lineTo(6.9697f, 5.4697f)
                curveTo(7.2626f, 5.1768f, 7.7374f, 5.1768f, 8.0303f, 5.4697f)
                curveTo(8.3232f, 5.7626f, 8.3232f, 6.2374f, 8.0303f, 6.5303f)
                lineTo(7.8107f, 6.75f)
                horizontalLineTo(8.0f)
                curveTo(9.6795f, 6.75f, 11.1554f, 7.6216f, 12.0f, 8.9372f)
                curveTo(12.8446f, 7.6216f, 14.3205f, 6.75f, 16.0f, 6.75f)
                horizontalLineTo(16.1893f)
                lineTo(15.9697f, 6.5303f)
                curveTo(15.6768f, 6.2374f, 15.6768f, 5.7626f, 15.9697f, 5.4697f)
                curveTo(16.2626f, 5.1768f, 16.7374f, 5.1768f, 17.0303f, 5.4697f)
                lineTo(18.5303f, 6.9697f)
                curveTo(18.8232f, 7.2626f, 18.8232f, 7.7374f, 18.5303f, 8.0303f)
                lineTo(17.0303f, 9.5303f)
                curveTo(16.7374f, 9.8232f, 16.2626f, 9.8232f, 15.9697f, 9.5303f)
                curveTo(15.6768f, 9.2374f, 15.6768f, 8.7626f, 15.9697f, 8.4697f)
                lineTo(16.1893f, 8.25f)
                horizontalLineTo(16.0f)
                curveTo(14.2051f, 8.25f, 12.75f, 9.7051f, 12.75f, 11.5f)
                verticalLineTo(17.5f)
                close()
            }
        }
            .build()
        return _branchingPathsUp!!
    }

private var _branchingPathsUp: ImageVector? = null
