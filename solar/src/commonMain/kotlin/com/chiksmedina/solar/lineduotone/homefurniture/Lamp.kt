package com.chiksmedina.solar.lineduotone.homefurniture

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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(
            name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.9614f, 7.4445f)
                curveTo(5.5703f, 5.0991f, 5.8748f, 3.9264f, 6.6609f, 3.1514f)
                curveTo(6.8888f, 2.9268f, 7.1428f, 2.7303f, 7.4175f, 2.5662f)
                curveTo(8.3652f, 2.0f, 9.5767f, 2.0f, 11.9999f, 2.0f)
                curveTo(14.4231f, 2.0f, 15.6346f, 2.0f, 16.5823f, 2.5662f)
                curveTo(16.857f, 2.7303f, 17.111f, 2.9268f, 17.3389f, 3.1514f)
                curveTo(18.125f, 3.9264f, 18.4295f, 5.0991f, 19.0384f, 7.4445f)
                lineTo(19.1226f, 7.769f)
                curveTo(19.9504f, 10.9576f, 20.3643f, 12.5519f, 19.6125f, 13.6719f)
                curveTo(19.5375f, 13.7837f, 19.4551f, 13.8902f, 19.3658f, 13.9909f)
                curveTo(18.4706f, 15.0f, 16.8235f, 15.0f, 13.5292f, 15.0f)
                horizontalLineTo(10.4706f)
                curveTo(7.1764f, 15.0f, 5.5292f, 15.0f, 4.634f, 13.9909f)
                curveTo(4.5447f, 13.8902f, 4.4623f, 13.7837f, 4.3873f, 13.6719f)
                curveTo(3.6355f, 12.5519f, 4.0494f, 10.9576f, 4.8772f, 7.769f)
                lineTo(4.9614f, 7.4445f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5f, 15.0f)
                verticalLineTo(17.0f)
            }
        }
            .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
