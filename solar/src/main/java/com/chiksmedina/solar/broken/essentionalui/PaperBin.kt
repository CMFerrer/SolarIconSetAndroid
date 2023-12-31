package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.PaperBin: ImageVector
    get() {
        if (_paperBin != null) {
            return _paperBin!!
        }
        _paperBin = Builder(
            name = "PaperBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 2.0522f)
                curveTo(19.3683f, 2.1416f, 20.2228f, 2.3842f, 20.7896f, 3.0423f)
                curveTo(21.6872f, 4.0847f, 21.4469f, 5.6865f, 20.9664f, 8.89f)
                lineTo(19.7664f, 16.89f)
                curveTo(19.4008f, 19.3276f, 19.2179f, 20.5464f, 18.374f, 21.2732f)
                curveTo(17.5301f, 22.0f, 16.2976f, 22.0f, 13.8328f, 22.0f)
                horizontalLineTo(10.167f)
                curveTo(7.7022f, 22.0f, 6.4697f, 22.0f, 5.6258f, 21.2732f)
                curveTo(4.7819f, 20.5464f, 4.5991f, 19.3276f, 4.2334f, 16.89f)
                lineTo(3.0334f, 8.89f)
                curveTo(2.5529f, 5.6865f, 2.3126f, 4.0847f, 3.2102f, 3.0423f)
                curveTo(4.1079f, 2.0f, 5.7276f, 2.0f, 8.967f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 6.0f)
                lineTo(3.5f, 11.0f)
                lineTo(11.0f, 19.0f)
                moveTo(14.0f, 6.0f)
                lineTo(4.0f, 16.0f)
                moveTo(20.0f, 6.0f)
                lineTo(7.0f, 19.0f)
                moveTo(13.0f, 19.0f)
                lineTo(20.5f, 11.0f)
                lineTo(16.0f, 6.0f)
                moveTo(10.0f, 6.0f)
                lineTo(20.0f, 16.0f)
                moveTo(4.0f, 6.0f)
                lineTo(17.0f, 19.0f)
            }
        }
            .build()
        return _paperBin!!
    }

private var _paperBin: ImageVector? = null
