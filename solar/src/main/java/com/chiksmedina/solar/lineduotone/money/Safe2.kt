package com.chiksmedina.solar.lineduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.lineduotone.MoneyGroup

public val MoneyGroup.Safe2: ImageVector
    get() {
        if (_safe2 != null) {
            return _safe2!!
        }
        _safe2 = Builder(name = "Safe2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f)
                curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12.0f)
                curveTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12.0f, 10.5f)
                curveTo(12.8284f, 10.5f, 13.5f, 11.1716f, 13.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(11.7046f, 12.6894f)
                lineTo(15.2046f, 14.1894f)
                lineTo(15.7954f, 12.8106f)
                lineTo(12.2954f, 11.3106f)
                lineTo(11.7046f, 12.6894f)
                close()
                moveTo(11.7046f, 11.3106f)
                lineTo(8.2046f, 12.8106f)
                lineTo(8.7954f, 14.1894f)
                lineTo(12.2954f, 12.6894f)
                lineTo(11.7046f, 11.3106f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.25f)
                curveTo(10.2051f, 15.25f, 8.75f, 13.7949f, 8.75f, 12.0f)
                horizontalLineTo(7.25f)
                curveTo(7.25f, 14.6234f, 9.3766f, 16.75f, 12.0f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(15.25f, 12.0f)
                curveTo(15.25f, 13.7949f, 13.7949f, 15.25f, 12.0f, 15.25f)
                verticalLineTo(16.75f)
                curveTo(14.6234f, 16.75f, 16.75f, 14.6234f, 16.75f, 12.0f)
                horizontalLineTo(15.25f)
                close()
                moveTo(12.0f, 8.75f)
                curveTo(13.7949f, 8.75f, 15.25f, 10.2051f, 15.25f, 12.0f)
                horizontalLineTo(16.75f)
                curveTo(16.75f, 9.3766f, 14.6234f, 7.25f, 12.0f, 7.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(12.0f, 7.25f)
                curveTo(9.3766f, 7.25f, 7.25f, 9.3766f, 7.25f, 12.0f)
                horizontalLineTo(8.75f)
                curveTo(8.75f, 10.2051f, 10.2051f, 8.75f, 12.0f, 8.75f)
                verticalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 7.0f)
                curveTo(5.25f, 6.5858f, 4.9142f, 6.25f, 4.5f, 6.25f)
                curveTo(4.0858f, 6.25f, 3.75f, 6.5858f, 3.75f, 7.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.75f, 10.0f)
                curveTo(3.75f, 10.4142f, 4.0858f, 10.75f, 4.5f, 10.75f)
                curveTo(4.9142f, 10.75f, 5.25f, 10.4142f, 5.25f, 10.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(5.25f, 14.0f)
                curveTo(5.25f, 13.5858f, 4.9142f, 13.25f, 4.5f, 13.25f)
                curveTo(4.0858f, 13.25f, 3.75f, 13.5858f, 3.75f, 14.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.75f, 17.0f)
                curveTo(3.75f, 17.4142f, 4.0858f, 17.75f, 4.5f, 17.75f)
                curveTo(4.9142f, 17.75f, 5.25f, 17.4142f, 5.25f, 17.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(11.0f, 5.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(18.25f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(13.0f, 18.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.25f)
                close()
                moveTo(5.75f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(11.0f, 18.25f)
                curveTo(9.5646f, 18.25f, 8.5635f, 18.2484f, 7.8081f, 18.1469f)
                curveTo(7.0743f, 18.0482f, 6.6858f, 17.8678f, 6.409f, 17.591f)
                lineTo(5.3484f, 18.6517f)
                curveTo(5.9503f, 19.2536f, 6.7081f, 19.5125f, 7.6083f, 19.6335f)
                curveTo(8.4868f, 19.7516f, 9.607f, 19.75f, 11.0f, 19.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(4.25f, 13.0f)
                curveTo(4.25f, 14.393f, 4.2484f, 15.5132f, 4.3665f, 16.3918f)
                curveTo(4.4875f, 17.2919f, 4.7464f, 18.0497f, 5.3484f, 18.6517f)
                lineTo(6.409f, 17.591f)
                curveTo(6.1322f, 17.3142f, 5.9518f, 16.9257f, 5.8531f, 16.1919f)
                curveTo(5.7516f, 15.4365f, 5.75f, 14.4354f, 5.75f, 13.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(18.25f, 13.0f)
                curveTo(18.25f, 14.4354f, 18.2484f, 15.4365f, 18.1469f, 16.1919f)
                curveTo(18.0482f, 16.9257f, 17.8678f, 17.3142f, 17.591f, 17.591f)
                lineTo(18.6517f, 18.6517f)
                curveTo(19.2536f, 18.0497f, 19.5125f, 17.2919f, 19.6335f, 16.3918f)
                curveTo(19.7516f, 15.5132f, 19.75f, 14.393f, 19.75f, 13.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(13.0f, 19.75f)
                curveTo(14.393f, 19.75f, 15.5132f, 19.7516f, 16.3918f, 19.6335f)
                curveTo(17.2919f, 19.5125f, 18.0497f, 19.2536f, 18.6517f, 18.6517f)
                lineTo(17.591f, 17.591f)
                curveTo(17.3142f, 17.8678f, 16.9257f, 18.0482f, 16.1919f, 18.1469f)
                curveTo(15.4365f, 18.2484f, 14.4354f, 18.25f, 13.0f, 18.25f)
                verticalLineTo(19.75f)
                close()
                moveTo(13.0f, 5.75f)
                curveTo(14.4354f, 5.75f, 15.4365f, 5.7516f, 16.1919f, 5.8531f)
                curveTo(16.9257f, 5.9518f, 17.3142f, 6.1322f, 17.591f, 6.409f)
                lineTo(18.6517f, 5.3484f)
                curveTo(18.0497f, 4.7464f, 17.2919f, 4.4875f, 16.3918f, 4.3665f)
                curveTo(15.5132f, 4.2484f, 14.393f, 4.25f, 13.0f, 4.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(19.75f, 11.0f)
                curveTo(19.75f, 9.607f, 19.7516f, 8.4868f, 19.6335f, 7.6083f)
                curveTo(19.5125f, 6.7081f, 19.2536f, 5.9503f, 18.6517f, 5.3484f)
                lineTo(17.591f, 6.409f)
                curveTo(17.8678f, 6.6858f, 18.0482f, 7.0743f, 18.1469f, 7.8081f)
                curveTo(18.2484f, 8.5635f, 18.25f, 9.5646f, 18.25f, 11.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(11.0f, 4.25f)
                curveTo(9.607f, 4.25f, 8.4868f, 4.2484f, 7.6083f, 4.3665f)
                curveTo(6.7081f, 4.4875f, 5.9503f, 4.7464f, 5.3484f, 5.3484f)
                lineTo(6.409f, 6.409f)
                curveTo(6.6858f, 6.1322f, 7.0743f, 5.9518f, 7.8081f, 5.8531f)
                curveTo(8.5635f, 5.7516f, 9.5646f, 5.75f, 11.0f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(5.75f, 11.0f)
                curveTo(5.75f, 9.5646f, 5.7516f, 8.5635f, 5.8531f, 7.8081f)
                curveTo(5.9518f, 7.0743f, 6.1322f, 6.6858f, 6.409f, 6.409f)
                lineTo(5.3484f, 5.3484f)
                curveTo(4.7464f, 5.9503f, 4.4875f, 6.7081f, 4.3665f, 7.6083f)
                curveTo(4.2484f, 8.4868f, 4.25f, 9.607f, 4.25f, 11.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(3.75f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3.75f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.25f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _safe2!!
    }

private var _safe2: ImageVector? = null
