package com.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MedicineGroup

public val MedicineGroup.DropperMinimalistic2: ImageVector
    get() {
        if (_dropperMinimalistic2 != null) {
            return _dropperMinimalistic2!!
        }
        _dropperMinimalistic2 = Builder(name = "DropperMinimalistic2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 10.9165f)
                curveTo(14.0f, 12.0671f, 13.1046f, 12.9998f, 12.0f, 12.9998f)
                curveTo(10.8954f, 12.9998f, 10.0f, 12.0671f, 10.0f, 10.9165f)
                curveTo(10.0f, 10.1966f, 10.783f, 9.2357f, 11.3691f, 8.6172f)
                curveTo(11.7161f, 8.2511f, 12.2839f, 8.2511f, 12.6309f, 8.6172f)
                curveTo(13.217f, 9.2357f, 14.0f, 10.1966f, 14.0f, 10.9165f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(14.0f, 2.8954f, 13.1046f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8954f, 2.0f, 10.0f, 2.8954f, 10.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(5.0f, 6.1144f, 5.0f, 5.1716f, 5.5858f, 4.5858f)
                curveTo(6.1716f, 4.0f, 7.1144f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(15.0f)
                curveTo(16.8856f, 4.0f, 17.8284f, 4.0f, 18.4142f, 4.5858f)
                curveTo(19.0f, 5.1716f, 19.0f, 6.1144f, 19.0f, 8.0f)
                verticalLineTo(15.8831f)
                curveTo(19.0f, 16.6438f, 18.6809f, 17.3697f, 18.1203f, 17.8841f)
                curveTo(14.6584f, 21.0607f, 9.3416f, 21.0607f, 5.8797f, 17.8841f)
                curveTo(5.3191f, 17.3697f, 5.0f, 16.6438f, 5.0f, 15.8831f)
                verticalLineTo(12.0f)
            }
        }
        .build()
        return _dropperMinimalistic2!!
    }

private var _dropperMinimalistic2: ImageVector? = null
