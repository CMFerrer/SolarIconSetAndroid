package com.chiksmedina.solar.broken.weather

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
import com.chiksmedina.solar.broken.WeatherGroup

val WeatherGroup.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(
            name = "Stars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5026f, 5.0169f)
                lineTo(9.9666f, 3.6579f)
                curveTo(9.6207f, 2.7807f, 8.3793f, 2.7807f, 8.0334f, 3.6578f)
                lineTo(6.9614f, 6.376f)
                curveTo(6.8558f, 6.6438f, 6.6438f, 6.8558f, 6.376f, 6.9614f)
                lineTo(3.6579f, 8.0334f)
                curveTo(2.7807f, 8.3793f, 2.7807f, 9.6207f, 3.6578f, 9.9666f)
                lineTo(6.376f, 11.0386f)
                curveTo(6.6438f, 11.1442f, 6.8558f, 11.3562f, 6.9614f, 11.624f)
                lineTo(8.0334f, 14.3422f)
                curveTo(8.3793f, 15.2193f, 9.6207f, 15.2193f, 9.9666f, 14.3422f)
                lineTo(11.0386f, 11.624f)
                curveTo(11.1442f, 11.3562f, 11.3562f, 11.1442f, 11.624f, 11.0386f)
                lineTo(14.3422f, 9.9666f)
                curveTo(15.2193f, 9.6207f, 15.2193f, 8.3793f, 14.3422f, 8.0334f)
                lineTo(12.9831f, 7.4974f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4885f, 13.3481f)
                curveTo(16.6715f, 12.884f, 17.3285f, 12.884f, 17.5115f, 13.3481f)
                lineTo(18.3121f, 15.3781f)
                curveTo(18.368f, 15.5198f, 18.4802f, 15.632f, 18.6219f, 15.6879f)
                lineTo(20.6519f, 16.4885f)
                curveTo(21.116f, 16.6715f, 21.116f, 17.3285f, 20.6519f, 17.5115f)
                lineTo(18.6219f, 18.3121f)
                curveTo(18.4802f, 18.368f, 18.368f, 18.4802f, 18.3121f, 18.6219f)
                lineTo(17.5115f, 20.6519f)
                curveTo(17.3285f, 21.116f, 16.6715f, 21.116f, 16.4885f, 20.6519f)
                lineTo(15.6879f, 18.6219f)
                curveTo(15.632f, 18.4802f, 15.5198f, 18.368f, 15.3781f, 18.3121f)
                lineTo(13.3481f, 17.5115f)
                curveTo(12.884f, 17.3285f, 12.884f, 16.6715f, 13.3481f, 16.4885f)
                lineTo(15.3781f, 15.6879f)
                curveTo(15.5198f, 15.632f, 15.632f, 15.5198f, 15.6879f, 15.3781f)
                lineTo(16.4885f, 13.3481f)
                close()
            }
        }
            .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
