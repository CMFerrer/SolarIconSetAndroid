package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.Routing2: ImageVector
    get() {
        if (_routing2 != null) {
            return _routing2!!
        }
        _routing2 = Builder(
            name = "Routing2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.5f, 14.0f)
                curveTo(16.567f, 14.0f, 15.0f, 15.4584f, 15.0f, 17.2573f)
                curveTo(15.0f, 19.0422f, 16.1171f, 21.125f, 17.86f, 21.8698f)
                curveTo(18.2663f, 22.0434f, 18.7337f, 22.0434f, 19.14f, 21.8698f)
                curveTo(20.8829f, 21.125f, 22.0f, 19.0422f, 22.0f, 17.2573f)
                curveTo(22.0f, 15.4584f, 20.433f, 14.0f, 18.5f, 14.0f)
                close()
                moveTo(18.5f, 18.5f)
                curveTo(19.0523f, 18.5f, 19.5f, 18.0523f, 19.5f, 17.5f)
                curveTo(19.5f, 16.9477f, 19.0523f, 16.5f, 18.5f, 16.5f)
                curveTo(17.9477f, 16.5f, 17.5f, 16.9477f, 17.5f, 17.5f)
                curveTo(17.5f, 18.0523f, 17.9477f, 18.5f, 18.5f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.5f, 2.0f)
                curveTo(3.567f, 2.0f, 2.0f, 3.4583f, 2.0f, 5.2573f)
                curveTo(2.0f, 7.0422f, 3.1171f, 9.125f, 4.86f, 9.8698f)
                curveTo(5.2663f, 10.0434f, 5.7337f, 10.0434f, 6.14f, 9.8698f)
                curveTo(7.8829f, 9.125f, 9.0f, 7.0422f, 9.0f, 5.2573f)
                curveTo(9.0f, 3.4583f, 7.433f, 2.0f, 5.5f, 2.0f)
                close()
                moveTo(5.5f, 6.5f)
                curveTo(6.0523f, 6.5f, 6.5f, 6.0523f, 6.5f, 5.5f)
                curveTo(6.5f, 4.9477f, 6.0523f, 4.5f, 5.5f, 4.5f)
                curveTo(4.9477f, 4.5f, 4.5f, 4.9477f, 4.5f, 5.5f)
                curveTo(4.5f, 6.0523f, 4.9477f, 6.5f, 5.5f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.25f, 5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                horizontalLineTo(16.1319f)
                curveTo(18.8831f, 4.25f, 19.9294f, 7.843f, 17.6083f, 9.3201f)
                lineTo(7.197f, 15.9454f)
                curveTo(6.142f, 16.6168f, 6.6175f, 18.25f, 7.8681f, 18.25f)
                horizontalLineTo(10.1893f)
                lineTo(9.9697f, 18.0303f)
                curveTo(9.6768f, 17.7374f, 9.6768f, 17.2626f, 9.9697f, 16.9697f)
                curveTo(10.2625f, 16.6768f, 10.7374f, 16.6768f, 11.0303f, 16.9697f)
                lineTo(12.5303f, 18.4697f)
                curveTo(12.8232f, 18.7626f, 12.8232f, 19.2374f, 12.5303f, 19.5303f)
                lineTo(11.0303f, 21.0303f)
                curveTo(10.7374f, 21.3232f, 10.2625f, 21.3232f, 9.9697f, 21.0303f)
                curveTo(9.6768f, 20.7374f, 9.6768f, 20.2626f, 9.9697f, 19.9697f)
                lineTo(10.1893f, 19.75f)
                horizontalLineTo(7.8681f)
                curveTo(5.1168f, 19.75f, 4.0706f, 16.157f, 6.3917f, 14.6799f)
                lineTo(16.803f, 8.0546f)
                curveTo(17.858f, 7.3832f, 17.3824f, 5.75f, 16.1319f, 5.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                close()
            }
        }
            .build()
        return _routing2!!
    }

private var _routing2: ImageVector? = null
