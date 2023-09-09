package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.Ruble: ImageVector
    get() {
        if (_ruble != null) {
            return _ruble!!
        }
        _ruble = Builder(name = "Ruble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 11.25f)
                horizontalLineTo(10.75f)
                verticalLineTo(8.2f)
                curveTo(10.75f, 8.103f, 10.7501f, 8.0453f, 10.7513f, 8.0018f)
                curveTo(10.752f, 7.9742f, 10.7531f, 7.9622f, 10.7533f, 7.9593f)
                curveTo(10.7708f, 7.8536f, 10.8536f, 7.7708f, 10.9593f, 7.7533f)
                curveTo(10.9622f, 7.753f, 10.9742f, 7.752f, 11.0018f, 7.7513f)
                curveTo(11.0453f, 7.7501f, 11.103f, 7.75f, 11.2f, 7.75f)
                horizontalLineTo(13.5f)
                curveTo(14.4665f, 7.75f, 15.25f, 8.5335f, 15.25f, 9.5f)
                curveTo(15.25f, 10.4665f, 14.4665f, 11.25f, 13.5f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(8.25f, 14.0f)
                curveTo(8.25f, 13.5858f, 8.5858f, 13.25f, 9.0f, 13.25f)
                horizontalLineTo(9.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 12.75f, 8.25f, 12.4142f, 8.25f, 12.0f)
                curveTo(8.25f, 11.5858f, 8.5858f, 11.25f, 9.0f, 11.25f)
                horizontalLineTo(9.25f)
                lineTo(9.25f, 8.1615f)
                curveTo(9.2498f, 8.016f, 9.2496f, 7.8647f, 9.2716f, 7.7262f)
                curveTo(9.3902f, 6.9774f, 9.9774f, 6.3902f, 10.7262f, 6.2716f)
                curveTo(10.8647f, 6.2496f, 11.016f, 6.2498f, 11.1615f, 6.25f)
                lineTo(13.5f, 6.25f)
                curveTo(15.2949f, 6.25f, 16.75f, 7.7051f, 16.75f, 9.5f)
                curveTo(16.75f, 11.2949f, 15.2949f, 12.75f, 13.5f, 12.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 13.25f, 12.75f, 13.5858f, 12.75f, 14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(17.0f)
                curveTo(10.75f, 17.4142f, 10.4142f, 17.75f, 10.0f, 17.75f)
                curveTo(9.5858f, 17.75f, 9.25f, 17.4142f, 9.25f, 17.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 14.75f, 8.25f, 14.4142f, 8.25f, 14.0f)
                close()
            }
        }
        .build()
        return _ruble!!
    }

private var _ruble: ImageVector? = null
