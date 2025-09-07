package com.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SportsGroup

val SportsGroup.WaterSun: ImageVector
    get() {
        if (_waterSun != null) {
            return _waterSun!!
        }
        _waterSun = Builder(
            name = "WaterSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 16.7723f)
                curveTo(20.4123f, 16.3982f, 19.5955f, 15.4791f, 18.9199f, 14.4569f)
                curveTo(18.4965f, 13.8163f, 17.5655f, 13.8553f, 17.1055f, 14.4701f)
                curveTo(16.0541f, 15.8757f, 14.4844f, 16.9999f, 12.0f, 16.9999f)
                curveTo(9.4935f, 16.9999f, 7.9181f, 15.5695f, 6.8665f, 14.2234f)
                curveTo(6.4272f, 13.6611f, 5.5862f, 13.6686f, 5.2017f, 14.2697f)
                curveTo(4.5008f, 15.3655f, 3.684f, 16.3755f, 2.0f, 16.7723f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 21.7723f)
                curveTo(20.4123f, 21.3982f, 19.5955f, 20.4791f, 18.9199f, 19.4569f)
                curveTo(18.4965f, 18.8163f, 17.5655f, 18.8553f, 17.1055f, 19.4701f)
                curveTo(16.0541f, 20.8757f, 14.4844f, 21.9999f, 12.0f, 21.9999f)
                curveTo(9.4935f, 21.9999f, 7.9181f, 20.5695f, 6.8665f, 19.2234f)
                curveTo(6.4272f, 18.6611f, 5.5862f, 18.6686f, 5.2017f, 19.2697f)
                curveTo(4.5008f, 20.3655f, 3.684f, 21.3755f, 2.0f, 21.7723f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9171f, 11.0f)
                curveTo(17.441f, 8.1623f, 14.973f, 6.0f, 12.0f, 6.0f)
                curveTo(9.0271f, 6.0f, 6.5591f, 8.1623f, 6.083f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                lineTo(21.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 12.0f)
                lineTo(2.0f, 12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0703f, 4.9292f)
                lineTo(18.6775f, 5.322f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.3223f, 5.3218f)
                lineTo(4.9294f, 4.9289f)
            }
        }
            .build()
        return _waterSun!!
    }

private var _waterSun: ImageVector? = null
