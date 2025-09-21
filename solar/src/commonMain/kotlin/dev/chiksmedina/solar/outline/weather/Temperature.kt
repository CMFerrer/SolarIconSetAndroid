package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = Builder(
            name = "Temperature", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 5.0f)
                curveTo(8.25f, 2.9289f, 9.9289f, 1.25f, 12.0f, 1.25f)
                curveTo(14.0711f, 1.25f, 15.75f, 2.9289f, 15.75f, 5.0f)
                verticalLineTo(11.3477f)
                curveTo(15.75f, 11.42f, 15.7896f, 11.5273f, 15.9078f, 11.6221f)
                curveTo(17.3345f, 12.7663f, 18.25f, 14.5265f, 18.25f, 16.5f)
                curveTo(18.25f, 19.9518f, 15.4518f, 22.75f, 12.0f, 22.75f)
                curveTo(8.5482f, 22.75f, 5.75f, 19.9518f, 5.75f, 16.5f)
                curveTo(5.75f, 14.5265f, 6.6656f, 12.7663f, 8.0921f, 11.6221f)
                curveTo(8.2104f, 11.5273f, 8.25f, 11.42f, 8.25f, 11.3477f)
                verticalLineTo(5.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(10.7574f, 2.75f, 9.75f, 3.7574f, 9.75f, 5.0f)
                verticalLineTo(11.3477f)
                curveTo(9.75f, 11.9513f, 9.4397f, 12.4642f, 9.0307f, 12.7923f)
                curveTo(7.9437f, 13.664f, 7.25f, 15.0007f, 7.25f, 16.5f)
                curveTo(7.25f, 19.1234f, 9.3766f, 21.25f, 12.0f, 21.25f)
                curveTo(14.6234f, 21.25f, 16.75f, 19.1234f, 16.75f, 16.5f)
                curveTo(16.75f, 15.0007f, 16.0563f, 13.664f, 14.9693f, 12.7923f)
                curveTo(14.5603f, 12.4642f, 14.25f, 11.9513f, 14.25f, 11.3477f)
                verticalLineTo(5.0f)
                curveTo(14.25f, 3.7574f, 13.2426f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.0f, 4.25f)
                curveTo(12.4142f, 4.25f, 12.75f, 4.5858f, 12.75f, 5.0f)
                lineTo(12.7498f, 13.3369f)
                curveTo(14.1831f, 13.6754f, 15.2498f, 14.9631f, 15.2498f, 16.4999f)
                curveTo(15.2498f, 18.2948f, 13.7947f, 19.7499f, 11.9998f, 19.7499f)
                curveTo(10.2048f, 19.7499f, 8.7498f, 18.2948f, 8.7498f, 16.4999f)
                curveTo(8.7498f, 14.9631f, 9.8164f, 13.6754f, 11.2498f, 13.3368f)
                lineTo(11.25f, 5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                close()
                moveTo(11.9998f, 14.7499f)
                curveTo(11.0333f, 14.7499f, 10.2498f, 15.5334f, 10.2498f, 16.4999f)
                curveTo(10.2498f, 17.4664f, 11.0333f, 18.2499f, 11.9998f, 18.2499f)
                curveTo(12.9663f, 18.2499f, 13.7498f, 17.4664f, 13.7498f, 16.4999f)
                curveTo(13.7498f, 15.5334f, 12.9663f, 14.7499f, 11.9998f, 14.7499f)
                close()
            }
        }
            .build()
        return _temperature!!
    }

private var _temperature: ImageVector? = null
