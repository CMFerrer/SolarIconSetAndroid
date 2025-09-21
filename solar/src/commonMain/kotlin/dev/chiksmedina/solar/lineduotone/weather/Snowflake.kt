package dev.chiksmedina.solar.lineduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.WeatherGroup

val WeatherGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(
            name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(18.0f)
                moveTo(12.0f, 22.0f)
                verticalLineTo(18.0f)
                moveTo(12.0f, 18.0f)
                lineTo(15.0f, 21.0f)
                moveTo(12.0f, 18.0f)
                lineTo(9.0f, 21.0f)
                moveTo(15.0f, 3.0f)
                lineTo(12.0f, 6.0f)
                lineTo(9.0f, 3.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.3399f, 6.9999f)
                lineTo(6.804f, 8.9999f)
                moveTo(6.804f, 8.9999f)
                lineTo(12.0f, 11.9999f)
                moveTo(6.804f, 8.9999f)
                lineTo(5.7059f, 4.9019f)
                moveTo(6.804f, 8.9999f)
                lineTo(2.7059f, 10.098f)
                moveTo(12.0f, 11.9999f)
                lineTo(17.1963f, 14.9999f)
                moveTo(12.0f, 11.9999f)
                lineTo(17.1961f, 8.9999f)
                moveTo(12.0f, 11.9999f)
                lineTo(6.8038f, 14.9999f)
                moveTo(17.1963f, 14.9999f)
                lineTo(20.6604f, 16.9999f)
                moveTo(17.1963f, 14.9999f)
                lineTo(21.2943f, 13.9019f)
                moveTo(17.1963f, 14.9999f)
                lineTo(18.2943f, 19.098f)
                moveTo(20.6602f, 6.9999f)
                lineTo(17.1961f, 8.9999f)
                moveTo(17.1961f, 8.9999f)
                lineTo(18.2941f, 4.9019f)
                moveTo(17.1961f, 8.9999f)
                lineTo(21.2941f, 10.098f)
                moveTo(6.8038f, 14.9999f)
                lineTo(3.3397f, 16.9999f)
                moveTo(6.8038f, 14.9999f)
                lineTo(2.7057f, 13.9019f)
                moveTo(6.8038f, 14.9999f)
                lineTo(5.7057f, 19.098f)
            }
        }
            .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
