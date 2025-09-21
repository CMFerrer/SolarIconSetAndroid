package dev.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.DropperMinimalistic2: ImageVector
    get() {
        if (_dropperMinimalistic2 != null) {
            return _dropperMinimalistic2!!
        }
        _dropperMinimalistic2 = Builder(
            name = "DropperMinimalistic2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.0f, 8.0f)
                verticalLineTo(15.8831f)
                curveTo(19.0f, 16.6438f, 18.6809f, 17.3697f, 18.1203f, 17.8841f)
                curveTo(16.5867f, 19.2913f, 14.6891f, 20.0751f, 12.75f, 20.2356f)
                verticalLineTo(21.25f)
                curveTo(12.75f, 21.6642f, 12.4142f, 22.0f, 12.0f, 22.0f)
                curveTo(11.5858f, 22.0f, 11.25f, 21.6642f, 11.25f, 21.25f)
                verticalLineTo(20.2356f)
                curveTo(9.3109f, 20.0751f, 7.4133f, 19.2913f, 5.8797f, 17.8841f)
                curveTo(5.3191f, 17.3697f, 5.0f, 16.6438f, 5.0f, 15.8831f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 6.1144f, 5.0f, 5.1716f, 5.5858f, 4.5858f)
                curveTo(6.1716f, 4.0f, 7.1144f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(16.8856f, 4.0f, 17.8284f, 4.0f, 18.4142f, 4.5858f)
                curveTo(19.0f, 5.1716f, 19.0f, 6.1144f, 19.0f, 8.0f)
                close()
                moveTo(12.0f, 12.9999f)
                curveTo(13.1046f, 12.9999f, 14.0f, 12.0672f, 14.0f, 10.9166f)
                curveTo(14.0f, 10.1967f, 13.217f, 9.2358f, 12.6309f, 8.6174f)
                curveTo(12.2839f, 8.2512f, 11.7161f, 8.2512f, 11.3691f, 8.6174f)
                curveTo(10.783f, 9.2358f, 10.0f, 10.1967f, 10.0f, 10.9166f)
                curveTo(10.0f, 12.0672f, 10.8954f, 12.9999f, 12.0f, 12.9999f)
                close()
                moveTo(9.25f, 16.0f)
                curveTo(9.25f, 15.5858f, 9.5858f, 15.25f, 10.0f, 15.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 15.25f, 14.75f, 15.5858f, 14.75f, 16.0f)
                curveTo(14.75f, 16.4142f, 14.4142f, 16.75f, 14.0f, 16.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 16.75f, 9.25f, 16.4142f, 9.25f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.7325f, 3.0f)
                curveTo(13.3866f, 2.4022f, 12.7403f, 2.0f, 12.0f, 2.0f)
                curveTo(11.2597f, 2.0f, 10.6134f, 2.4022f, 10.2676f, 3.0f)
                lineTo(13.7325f, 3.0f)
                close()
            }
        }
            .build()
        return _dropperMinimalistic2!!
    }

private var _dropperMinimalistic2: ImageVector? = null
