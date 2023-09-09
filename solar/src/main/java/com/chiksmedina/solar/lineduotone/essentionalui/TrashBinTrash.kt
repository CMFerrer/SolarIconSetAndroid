package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.TrashBinTrash: ImageVector
    get() {
        if (_trashBinTrash != null) {
            return _trashBinTrash!!
        }
        _trashBinTrash = Builder(name = "TrashBinTrash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5001f, 6.0f)
                horizontalLineTo(3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.8334f, 8.5f)
                lineTo(18.3735f, 15.3991f)
                curveTo(18.1965f, 18.054f, 18.108f, 19.3815f, 17.243f, 20.1907f)
                curveTo(16.378f, 21.0f, 15.0476f, 21.0f, 12.3868f, 21.0f)
                horizontalLineTo(11.6134f)
                curveTo(8.9526f, 21.0f, 7.6222f, 21.0f, 6.7572f, 20.1907f)
                curveTo(5.8922f, 19.3815f, 5.8037f, 18.054f, 5.6267f, 15.3991f)
                lineTo(5.1667f, 8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 11.0f)
                lineTo(10.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                lineTo(14.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 6.0f)
                curveTo(6.5559f, 6.0f, 6.5838f, 6.0f, 6.6091f, 5.9994f)
                curveTo(7.4326f, 5.9785f, 8.159f, 5.4549f, 8.4392f, 4.6803f)
                curveTo(8.4478f, 4.6565f, 8.4567f, 4.63f, 8.4743f, 4.577f)
                lineTo(8.5714f, 4.2857f)
                curveTo(8.6543f, 4.0371f, 8.6958f, 3.9128f, 8.7507f, 3.8072f)
                curveTo(8.97f, 3.3861f, 9.3757f, 3.0936f, 9.8446f, 3.0188f)
                curveTo(9.9621f, 3.0f, 10.0932f, 3.0f, 10.3553f, 3.0f)
                horizontalLineTo(13.6447f)
                curveTo(13.9068f, 3.0f, 14.0379f, 3.0f, 14.1554f, 3.0188f)
                curveTo(14.6243f, 3.0936f, 15.03f, 3.3861f, 15.2493f, 3.8072f)
                curveTo(15.3043f, 3.9128f, 15.3457f, 4.0371f, 15.4286f, 4.2857f)
                lineTo(15.5257f, 4.577f)
                curveTo(15.5433f, 4.6299f, 15.5522f, 4.6565f, 15.5608f, 4.6803f)
                curveTo(15.841f, 5.4549f, 16.5674f, 5.9785f, 17.3909f, 5.9994f)
                curveTo(17.4162f, 6.0f, 17.4441f, 6.0f, 17.5f, 6.0f)
            }
        }
        .build()
        return _trashBinTrash!!
    }

private var _trashBinTrash: ImageVector? = null
