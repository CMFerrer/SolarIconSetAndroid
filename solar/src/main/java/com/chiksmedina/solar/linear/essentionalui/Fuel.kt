package com.chiksmedina.solar.linear.essentionalui

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
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.Fuel: ImageVector
    get() {
        if (_fuel != null) {
            return _fuel!!
        }
        _fuel = Builder(name = "Fuel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.0869f)
                curveTo(2.0f, 10.9906f, 2.0f, 9.9424f, 2.5533f, 9.1475f)
                curveTo(3.1065f, 8.3525f, 4.077f, 8.0062f, 6.0179f, 7.3137f)
                lineTo(14.0179f, 4.4593f)
                curveTo(17.6539f, 3.162f, 19.4718f, 2.5133f, 20.7359f, 3.4276f)
                curveTo(22.0f, 4.3418f, 22.0f, 6.3054f, 22.0f, 10.2325f)
                verticalLineTo(15.8834f)
                curveTo(22.0f, 18.7668f, 22.0f, 20.2085f, 21.1213f, 21.1042f)
                curveTo(20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 22.0f, 3.7574f, 22.0f, 2.8787f, 21.1042f)
                curveTo(2.0f, 20.2085f, 2.0f, 18.7668f, 2.0f, 15.8834f)
                verticalLineTo(13.0869f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                curveTo(9.0f, 12.5858f, 9.0f, 11.8787f, 9.4393f, 11.4393f)
                curveTo(9.8787f, 11.0f, 10.5858f, 11.0f, 12.0f, 11.0f)
                curveTo(13.4142f, 11.0f, 14.1213f, 11.0f, 14.5607f, 11.4393f)
                curveTo(15.0f, 11.8787f, 15.0f, 12.5858f, 15.0f, 14.0f)
                curveTo(15.0f, 15.4142f, 15.0f, 16.1213f, 14.5607f, 16.5607f)
                curveTo(14.1213f, 17.0f, 13.4142f, 17.0f, 12.0f, 17.0f)
                curveTo(10.5858f, 17.0f, 9.8787f, 17.0f, 9.4393f, 16.5607f)
                curveTo(9.0f, 16.1213f, 9.0f, 15.4142f, 9.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                lineTo(16.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                lineTo(8.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                lineTo(16.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                lineTo(8.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 7.0601f)
                curveTo(5.0f, 5.7551f, 5.0f, 5.1025f, 5.3382f, 4.653f)
                curveTo(5.4252f, 4.5373f, 5.5268f, 4.4337f, 5.6402f, 4.3449f)
                curveTo(6.0809f, 4.0f, 6.7206f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(8.8182f)
                curveTo(9.3254f, 4.0f, 9.5791f, 4.0f, 9.7872f, 4.0569f)
                curveTo(10.3519f, 4.2112f, 10.7929f, 4.6611f, 10.9442f, 5.2371f)
            }
        }
        .build()
        return _fuel!!
    }

private var _fuel: ImageVector? = null
