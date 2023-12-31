package com.chiksmedina.solar.linear.homefurniture

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
import com.chiksmedina.solar.linear.HomeFurnitureGroup

val HomeFurnitureGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(
            name = "Chair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 21.0f)
                verticalLineTo(16.0f)
                moveTo(7.0f, 21.0f)
                verticalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 12.0f)
                horizontalLineTo(8.5f)
                curveTo(6.8501f, 12.0f, 6.0251f, 12.0f, 5.5126f, 12.5858f)
                curveTo(5.2267f, 12.9125f, 5.1003f, 13.3503f, 5.0444f, 14.0008f)
                curveTo(4.9669f, 14.9018f, 4.9282f, 15.3523f, 5.2254f, 15.6762f)
                curveTo(5.5226f, 16.0f, 6.0151f, 16.0f, 7.0f, 16.0f)
                horizontalLineTo(17.0f)
                curveTo(17.985f, 16.0f, 18.4774f, 16.0f, 18.7746f, 15.6762f)
                curveTo(19.0718f, 15.3523f, 19.0331f, 14.9018f, 18.9557f, 14.0008f)
                curveTo(18.8998f, 13.3503f, 18.7733f, 12.9125f, 18.4874f, 12.5858f)
                curveTo(17.9749f, 12.0f, 17.1499f, 12.0f, 15.5f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 8.0f)
                curveTo(7.0f, 6.1308f, 7.0f, 5.1961f, 7.4019f, 4.5f)
                curveTo(7.6652f, 4.0439f, 8.0439f, 3.6652f, 8.5f, 3.4019f)
                curveTo(9.1961f, 3.0f, 10.1308f, 3.0f, 12.0f, 3.0f)
                curveTo(13.8692f, 3.0f, 14.8038f, 3.0f, 15.5f, 3.4019f)
                curveTo(15.9561f, 3.6652f, 16.3348f, 4.0439f, 16.5981f, 4.5f)
                curveTo(17.0f, 5.1961f, 17.0f, 6.1308f, 17.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
            .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
