package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.LinkRound: ImageVector
    get() {
        if (_linkRound != null) {
            return _linkRound!!
        }
        _linkRound = Builder(
            name = "LinkRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 2.25f)
                curveTo(4.2721f, 2.25f, 1.25f, 5.2721f, 1.25f, 9.0f)
                curveTo(1.25f, 10.7283f, 1.9005f, 12.3065f, 2.9689f, 13.5002f)
                curveTo(3.2452f, 13.8088f, 3.7193f, 13.8351f, 4.028f, 13.5589f)
                curveTo(4.3366f, 13.2826f, 4.3629f, 12.8085f, 4.0866f, 12.4998f)
                curveTo(3.2549f, 11.5705f, 2.75f, 10.3451f, 2.75f, 9.0f)
                curveTo(2.75f, 6.1005f, 5.1005f, 3.75f, 8.0f, 3.75f)
                horizontalLineTo(12.0f)
                curveTo(14.8995f, 3.75f, 17.25f, 6.1005f, 17.25f, 9.0f)
                curveTo(17.25f, 11.8995f, 14.8995f, 14.25f, 12.0f, 14.25f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 14.25f, 9.25f, 14.5858f, 9.25f, 15.0f)
                curveTo(9.25f, 15.4142f, 9.5858f, 15.75f, 10.0f, 15.75f)
                horizontalLineTo(12.0f)
                curveTo(15.7279f, 15.75f, 18.75f, 12.7279f, 18.75f, 9.0f)
                curveTo(18.75f, 5.2721f, 15.7279f, 2.25f, 12.0f, 2.25f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.75f, 15.0f)
                curveTo(6.75f, 12.1005f, 9.1005f, 9.75f, 12.0f, 9.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 9.75f, 14.75f, 9.4142f, 14.75f, 9.0f)
                curveTo(14.75f, 8.5858f, 14.4142f, 8.25f, 14.0f, 8.25f)
                horizontalLineTo(12.0f)
                curveTo(8.2721f, 8.25f, 5.25f, 11.2721f, 5.25f, 15.0f)
                curveTo(5.25f, 18.7279f, 8.2721f, 21.75f, 12.0f, 21.75f)
                horizontalLineTo(16.0f)
                curveTo(19.7279f, 21.75f, 22.75f, 18.7279f, 22.75f, 15.0f)
                curveTo(22.75f, 13.2717f, 22.0995f, 11.6935f, 21.0311f, 10.4998f)
                curveTo(20.7548f, 10.1912f, 20.2807f, 10.1649f, 19.972f, 10.4411f)
                curveTo(19.6634f, 10.7174f, 19.6371f, 11.1915f, 19.9134f, 11.5002f)
                curveTo(20.7451f, 12.4295f, 21.25f, 13.6549f, 21.25f, 15.0f)
                curveTo(21.25f, 17.8995f, 18.8995f, 20.25f, 16.0f, 20.25f)
                horizontalLineTo(12.0f)
                curveTo(9.1005f, 20.25f, 6.75f, 17.8995f, 6.75f, 15.0f)
                close()
            }
        }
            .build()
        return _linkRound!!
    }

private var _linkRound: ImageVector? = null
