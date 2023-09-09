package com.chiksmedina.solar.lineduotone.medicine

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
import com.chiksmedina.solar.lineduotone.MedicineGroup

public val MedicineGroup.DropperMinimalistic: ImageVector
    get() {
        if (_dropperMinimalistic != null) {
            return _dropperMinimalistic!!
        }
        _dropperMinimalistic = Builder(name = "DropperMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 15.8831f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 6.1144f, 19.0f, 5.1716f, 18.4142f, 4.5858f)
                curveTo(17.8284f, 4.0f, 16.8856f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 4.0f, 6.1716f, 4.0f, 5.5858f, 4.5858f)
                curveTo(5.0f, 5.1716f, 5.0f, 6.1144f, 5.0f, 8.0f)
                verticalLineTo(15.8831f)
                curveTo(5.0f, 16.6438f, 5.3191f, 17.3697f, 5.8797f, 17.8841f)
                curveTo(9.3416f, 21.0607f, 14.6584f, 21.0607f, 18.1203f, 17.8841f)
                curveTo(18.6809f, 17.3697f, 19.0f, 16.6438f, 19.0f, 15.8831f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineTo(17.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 11.9167f)
                curveTo(14.0f, 13.0673f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.0673f, 10.0f, 11.9167f)
                curveTo(10.0f, 11.1968f, 10.783f, 10.2359f, 11.3691f, 9.6175f)
                curveTo(11.7161f, 9.2514f, 12.2839f, 9.2514f, 12.6309f, 9.6175f)
                curveTo(13.217f, 10.2359f, 14.0f, 11.1968f, 14.0f, 11.9167f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(14.0f, 2.8954f, 13.1046f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8954f, 2.0f, 10.0f, 2.8954f, 10.0f, 4.0f)
            }
        }
        .build()
        return _dropperMinimalistic!!
    }

private var _dropperMinimalistic: ImageVector? = null
