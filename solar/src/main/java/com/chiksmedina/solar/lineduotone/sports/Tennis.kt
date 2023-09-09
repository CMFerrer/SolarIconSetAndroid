package com.chiksmedina.solar.lineduotone.sports

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
import com.chiksmedina.solar.lineduotone.SportsGroup

public val SportsGroup.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.34f, 16.9997f)
                curveTo(6.1014f, 21.7826f, 12.2173f, 23.4214f, 17.0002f, 20.66f)
                curveTo(18.9498f, 19.5344f, 20.377f, 17.8514f, 21.1967f, 15.9286f)
                curveTo(22.388f, 13.1341f, 22.2963f, 9.833f, 20.6605f, 6.9997f)
                curveTo(19.0246f, 4.1664f, 16.2117f, 2.4364f, 13.196f, 2.0709f)
                curveTo(11.1209f, 1.8194f, 8.9498f, 2.2139f, 7.0002f, 3.3395f)
                curveTo(2.2173f, 6.1009f, 0.5785f, 12.2168f, 3.34f, 16.9997f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1958f, 2.0713f)
                curveTo(13.1958f, 2.0713f, 12.9641f, 5.67f, 15.4641f, 10.0001f)
                curveTo(17.9641f, 14.3303f, 21.1965f, 15.929f, 21.1965f, 15.929f)
                moveTo(2.8035f, 8.0713f)
                curveTo(2.8035f, 8.0713f, 6.0359f, 9.67f, 8.5359f, 14.0001f)
                curveTo(11.0359f, 18.3303f, 10.8042f, 21.929f, 10.8042f, 21.929f)
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
