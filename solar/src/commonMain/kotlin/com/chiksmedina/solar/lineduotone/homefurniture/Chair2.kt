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

val HomeFurnitureGroup.Chair2: ImageVector
    get() {
        if (_chair2 != null) {
            return _chair2!!
        }
        _chair2 = Builder(
            name = "Chair2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 15.5f)
                curveTo(6.0f, 14.9477f, 6.4477f, 14.5f, 7.0f, 14.5f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 14.5f, 18.0f, 14.9477f, 18.0f, 15.5f)
                curveTo(18.0f, 16.6046f, 17.1046f, 17.5f, 16.0f, 17.5f)
                horizontalLineTo(8.0f)
                curveTo(6.8954f, 17.5f, 6.0f, 16.6046f, 6.0f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.6281f, 6.7658f)
                curveTo(6.8695f, 4.7544f, 6.9902f, 3.7487f, 7.5719f, 3.0616f)
                curveTo(7.7565f, 2.8435f, 7.9713f, 2.653f, 8.2098f, 2.4957f)
                curveTo(8.9613f, 2.0f, 9.9742f, 2.0f, 12.0f, 2.0f)
                curveTo(14.0258f, 2.0f, 15.0388f, 2.0f, 15.7903f, 2.4957f)
                curveTo(16.0288f, 2.653f, 16.2436f, 2.8435f, 16.4282f, 3.0616f)
                curveTo(17.0099f, 3.7487f, 17.1306f, 4.7544f, 17.3719f, 6.7658f)
                lineTo(17.4628f, 7.5234f)
                curveTo(17.7133f, 9.6109f, 17.8386f, 10.6546f, 17.2418f, 11.3273f)
                curveTo(16.645f, 12.0f, 15.5937f, 12.0f, 13.4913f, 12.0f)
                horizontalLineTo(10.5087f)
                curveTo(8.4063f, 12.0f, 7.3551f, 12.0f, 6.7583f, 11.3273f)
                curveTo(6.1615f, 10.6546f, 6.2867f, 9.6109f, 6.5372f, 7.5234f)
                lineTo(6.6281f, 6.7658f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 20.0f)
                verticalLineTo(17.5f)
                moveTo(12.0f, 20.0f)
                lineTo(12.4661f, 20.1165f)
                curveTo(13.4214f, 20.3554f, 14.1886f, 21.0658f, 14.5f, 22.0f)
                moveTo(12.0f, 20.0f)
                lineTo(11.5339f, 20.1165f)
                curveTo(10.5786f, 20.3554f, 9.8114f, 21.0658f, 9.5f, 22.0f)
                moveTo(6.0f, 16.0f)
                lineTo(5.1348f, 13.4045f)
                curveTo(5.0617f, 13.1852f, 5.0252f, 13.0755f, 4.9542f, 12.9225f)
                curveTo(4.8833f, 12.7695f, 4.8541f, 12.7215f, 4.7958f, 12.6256f)
                curveTo(4.3394f, 11.8752f, 3.7325f, 11.5f, 2.0f, 11.5f)
                moveTo(18.0f, 16.0f)
                lineTo(18.8652f, 13.4045f)
                curveTo(18.9383f, 13.1852f, 18.9748f, 13.0755f, 19.0458f, 12.9225f)
                curveTo(19.1167f, 12.7695f, 19.1459f, 12.7215f, 19.2042f, 12.6256f)
                curveTo(19.6606f, 11.8752f, 20.2675f, 11.5f, 22.0f, 11.5f)
            }
        }
            .build()
        return _chair2!!
    }

private var _chair2: ImageVector? = null
