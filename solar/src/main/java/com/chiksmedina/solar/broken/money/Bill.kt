package com.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MoneyGroup

public val MoneyGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                verticalLineTo(3.5052f)
                curveTo(21.0f, 2.922f, 20.3109f, 2.6125f, 19.875f, 3.0f)
                curveTo(19.2334f, 3.5703f, 18.2666f, 3.5703f, 17.625f, 3.0f)
                curveTo(16.9834f, 2.4297f, 16.0166f, 2.4297f, 15.375f, 3.0f)
                curveTo(14.7334f, 3.5703f, 13.7666f, 3.5703f, 13.125f, 3.0f)
                curveTo(12.4834f, 2.4297f, 11.5166f, 2.4297f, 10.875f, 3.0f)
                curveTo(10.2334f, 3.5703f, 9.2666f, 3.5703f, 8.625f, 3.0f)
                curveTo(7.9834f, 2.4297f, 7.0166f, 2.4297f, 6.375f, 3.0f)
                curveTo(5.7334f, 3.5703f, 4.7666f, 3.5703f, 4.125f, 3.0f)
                curveTo(3.6891f, 2.6125f, 3.0f, 2.922f, 3.0f, 3.5052f)
                verticalLineTo(14.0f)
                moveTo(21.0f, 10.0f)
                verticalLineTo(20.495f)
                curveTo(21.0f, 21.0782f, 20.3109f, 21.3876f, 19.875f, 21.0002f)
                curveTo(19.2334f, 20.4299f, 18.2666f, 20.4299f, 17.625f, 21.0002f)
                curveTo(16.9834f, 21.5705f, 16.0166f, 21.5705f, 15.375f, 21.0002f)
                curveTo(14.7334f, 20.4299f, 13.7666f, 20.4299f, 13.125f, 21.0002f)
                curveTo(12.4834f, 21.5705f, 11.5166f, 21.5705f, 10.875f, 21.0002f)
                curveTo(10.2334f, 20.4299f, 9.2666f, 20.4299f, 8.625f, 21.0002f)
                curveTo(7.9834f, 21.5705f, 7.0166f, 21.5705f, 6.375f, 21.0002f)
                curveTo(5.7334f, 20.4299f, 4.7666f, 20.4299f, 4.125f, 21.0002f)
                curveTo(3.6891f, 21.3876f, 3.0f, 21.0782f, 3.0f, 20.495f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 15.5f)
                horizontalLineTo(11.5f)
                moveTo(16.5f, 15.5f)
                horizontalLineTo(14.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                horizontalLineTo(12.5f)
                moveTo(7.5f, 12.0f)
                horizontalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 8.5f)
                horizontalLineTo(16.5f)
            }
        }
        .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
