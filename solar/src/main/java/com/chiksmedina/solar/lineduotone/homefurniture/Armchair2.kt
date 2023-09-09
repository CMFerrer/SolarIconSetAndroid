package com.chiksmedina.solar.lineduotone.homefurniture

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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.Armchair2: ImageVector
    get() {
        if (_armchair2 != null) {
            return _armchair2!!
        }
        _armchair2 = Builder(name = "Armchair2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8863f, 18.0f)
                horizontalLineTo(16.5332f)
                curveTo(17.1502f, 18.0f, 17.4587f, 18.0f, 17.7354f, 17.9611f)
                curveTo(18.8608f, 17.8028f, 19.8348f, 17.1756f, 20.3588f, 16.2717f)
                curveTo(20.4876f, 16.0494f, 20.5852f, 15.7879f, 20.7803f, 15.2649f)
                lineTo(21.8997f, 12.2643f)
                curveTo(22.3153f, 11.1504f, 21.3873f, 10.0f, 20.0731f, 10.0f)
                curveTo(19.2628f, 10.0f, 18.5392f, 10.4533f, 18.263f, 11.1339f)
                lineTo(17.2623f, 13.6f)
                curveTo(17.0683f, 14.078f, 16.9713f, 14.317f, 16.787f, 14.4835f)
                curveTo(16.6864f, 14.5744f, 16.5683f, 14.6484f, 16.4383f, 14.7019f)
                curveTo(16.2004f, 14.8f, 15.9158f, 14.8f, 15.3467f, 14.8f)
                horizontalLineTo(8.3676f)
                curveTo(8.0744f, 14.8f, 7.9278f, 14.8f, 7.7972f, 14.7735f)
                curveTo(7.4922f, 14.7116f, 7.2266f, 14.5452f, 7.0574f, 14.3101f)
                curveTo(6.985f, 14.2094f, 6.9351f, 14.0863f, 6.8351f, 13.84f)
                lineTo(5.737f, 11.1339f)
                curveTo(5.4608f, 10.4533f, 4.7372f, 10.0f, 3.9269f, 10.0f)
                curveTo(2.6127f, 10.0f, 1.6847f, 11.1504f, 2.1003f, 12.2643f)
                lineTo(3.4033f, 15.757f)
                curveTo(3.4229f, 15.8095f, 3.4327f, 15.8357f, 3.442f, 15.8594f)
                curveTo(3.9387f, 17.1243f, 5.2652f, 17.9786f, 6.7653f, 17.9996f)
                curveTo(6.7934f, 18.0f, 6.8244f, 18.0f, 6.8863f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                verticalLineTo(8.5714f)
                curveTo(6.0f, 6.4164f, 6.0f, 5.3389f, 6.7029f, 4.6695f)
                curveTo(7.4059f, 4.0f, 8.5373f, 4.0f, 10.8f, 4.0f)
                horizontalLineTo(13.2f)
                curveTo(15.4627f, 4.0f, 16.5941f, 4.0f, 17.2971f, 4.6695f)
                curveTo(18.0f, 5.3389f, 18.0f, 6.4164f, 18.0f, 8.5714f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(6.0f, 20.0f)
                verticalLineTo(18.6667f)
            }
        }
        .build()
        return _armchair2!!
    }

private var _armchair2: ImageVector? = null
