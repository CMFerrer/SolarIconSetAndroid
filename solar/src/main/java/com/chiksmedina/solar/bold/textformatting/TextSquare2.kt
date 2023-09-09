package com.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.bold.TextFormattingGroup

public val TextFormattingGroup.TextSquare2: ImageVector
    get() {
        if (_textSquare2 != null) {
            return _textSquare2!!
        }
        _textSquare2 = Builder(name = "TextSquare2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.4672f, 2.0002f)
                curveTo(14.4105f, 1.9989f, 14.3551f, 2.0039f, 14.3018f, 2.0146f)
                curveTo(13.5511f, 2.0f, 12.7218f, 2.0f, 11.8069f, 2.0f)
                lineTo(11.6932f, 2.0f)
                curveTo(10.7782f, 2.0f, 9.9489f, 2.0f, 9.1982f, 2.0146f)
                curveTo(9.1449f, 2.0039f, 9.0895f, 1.9989f, 9.0328f, 2.0002f)
                curveTo(6.5482f, 2.0571f, 4.7776f, 2.2799f, 3.5372f, 3.5228f)
                lineTo(3.5298f, 3.5302f)
                lineTo(3.5228f, 3.5372f)
                curveTo(2.2799f, 4.7776f, 2.0571f, 6.5482f, 2.0002f, 9.0328f)
                curveTo(1.9989f, 9.0895f, 2.0039f, 9.1449f, 2.0146f, 9.1982f)
                curveTo(2.0127f, 9.2975f, 2.011f, 9.398f, 2.0096f, 9.5f)
                horizontalLineTo(3.75f)
                curveTo(4.9926f, 9.5f, 6.0f, 10.5074f, 6.0f, 11.75f)
                curveTo(6.0f, 12.9926f, 4.9926f, 14.0f, 3.75f, 14.0f)
                horizontalLineTo(2.0096f)
                curveTo(2.011f, 14.102f, 2.0127f, 14.2026f, 2.0146f, 14.3018f)
                curveTo(2.0039f, 14.3552f, 1.9989f, 14.4105f, 2.0002f, 14.4672f)
                curveTo(2.0571f, 16.9518f, 2.2799f, 18.7224f, 3.5228f, 19.9628f)
                lineTo(3.53f, 19.97f)
                lineTo(3.5372f, 19.9772f)
                curveTo(4.7776f, 21.2201f, 6.5482f, 21.4429f, 9.0328f, 21.4998f)
                curveTo(9.0895f, 21.5011f, 9.1449f, 21.4961f, 9.1982f, 21.4854f)
                curveTo(9.9489f, 21.5f, 10.7782f, 21.5f, 11.6931f, 21.5f)
                horizontalLineTo(11.8069f)
                curveTo(12.7218f, 21.5f, 13.5511f, 21.5f, 14.3018f, 21.4854f)
                curveTo(14.3552f, 21.4961f, 14.4105f, 21.5011f, 14.4672f, 21.4998f)
                curveTo(16.9518f, 21.4429f, 18.7224f, 21.2201f, 19.9628f, 19.9772f)
                lineTo(19.9699f, 19.9702f)
                lineTo(19.9772f, 19.9628f)
                curveTo(21.2201f, 18.7224f, 21.4429f, 16.9518f, 21.4998f, 14.4672f)
                curveTo(21.5011f, 14.4105f, 21.4961f, 14.3552f, 21.4854f, 14.3018f)
                curveTo(21.4873f, 14.2026f, 21.489f, 14.102f, 21.4904f, 14.0f)
                horizontalLineTo(19.75f)
                curveTo(18.5074f, 14.0f, 17.5f, 12.9926f, 17.5f, 11.75f)
                curveTo(17.5f, 10.5074f, 18.5074f, 9.5f, 19.75f, 9.5f)
                horizontalLineTo(21.4904f)
                curveTo(21.489f, 9.398f, 21.4873f, 9.2975f, 21.4854f, 9.1982f)
                curveTo(21.4961f, 9.1449f, 21.5011f, 9.0895f, 21.4998f, 9.0328f)
                curveTo(21.4429f, 6.5482f, 21.2201f, 4.7776f, 19.9772f, 3.5372f)
                lineTo(19.9701f, 3.53f)
                lineTo(19.9628f, 3.5228f)
                curveTo(18.7224f, 2.2799f, 16.9518f, 2.0571f, 14.4672f, 2.0002f)
                close()
                moveTo(7.75f, 7.0f)
                curveTo(7.3358f, 7.0f, 7.0f, 7.3358f, 7.0f, 7.75f)
                curveTo(7.0f, 8.1642f, 7.3358f, 8.5f, 7.75f, 8.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.75f)
                curveTo(11.0f, 16.1642f, 11.3358f, 16.5f, 11.75f, 16.5f)
                curveTo(12.1642f, 16.5f, 12.5f, 16.1642f, 12.5f, 15.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 8.5f, 16.5f, 8.1642f, 16.5f, 7.75f)
                curveTo(16.5f, 7.3358f, 16.1642f, 7.0f, 15.75f, 7.0f)
                horizontalLineTo(7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.75f)
                curveTo(19.0f, 11.3358f, 19.3358f, 11.0f, 19.75f, 11.0f)
                horizontalLineTo(21.75f)
                curveTo(22.1642f, 11.0f, 22.5f, 11.3358f, 22.5f, 11.75f)
                curveTo(22.5f, 12.1642f, 22.1642f, 12.5f, 21.75f, 12.5f)
                horizontalLineTo(19.75f)
                curveTo(19.3358f, 12.5f, 19.0f, 12.1642f, 19.0f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 11.0f)
                curveTo(1.3358f, 11.0f, 1.0f, 11.3358f, 1.0f, 11.75f)
                curveTo(1.0f, 12.1642f, 1.3358f, 12.5f, 1.75f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(4.1642f, 12.5f, 4.5f, 12.1642f, 4.5f, 11.75f)
                curveTo(4.5f, 11.3358f, 4.1642f, 11.0f, 3.75f, 11.0f)
                horizontalLineTo(1.75f)
                close()
            }
        }
        .build()
        return _textSquare2!!
    }

private var _textSquare2: ImageVector? = null
