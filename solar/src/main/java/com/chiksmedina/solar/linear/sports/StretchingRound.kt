package com.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SportsGroup

public val SportsGroup.StretchingRound: ImageVector
    get() {
        if (_stretchingRound != null) {
            return _stretchingRound!!
        }
        _stretchingRound = Builder(name = "StretchingRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 21.9955f)
                verticalLineTo(18.0484f)
                curveTo(19.0f, 16.2725f, 17.395f, 14.9194f, 15.6265f, 15.2042f)
                moveTo(7.9481f, 13.4343f)
                lineTo(7.9233f, 13.4104f)
                curveTo(6.8814f, 12.4036f, 7.6864f, 10.7847f, 8.5932f, 10.1422f)
                curveTo(9.5f, 9.4997f, 13.3451f, 8.4997f, 13.3451f, 13.4341f)
                curveTo(13.3451f, 18.1285f, 9.6944f, 21.9998f, 5.0f, 21.9998f)
            }
        }
        .build()
        return _stretchingRound!!
    }

private var _stretchingRound: ImageVector? = null
