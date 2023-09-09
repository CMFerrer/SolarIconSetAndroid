package com.chiksmedina.solar.lineduotone.electronicdevices

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
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.6471f, 15.5357f)
                horizontalLineTo(4.3529f)
                moveTo(19.6471f, 15.5357f)
                verticalLineTo(8.0f)
                curveTo(19.6471f, 6.1144f, 19.6471f, 5.1716f, 19.0613f, 4.5858f)
                curveTo(18.4755f, 4.0f, 17.5327f, 4.0f, 15.6471f, 4.0f)
                horizontalLineTo(8.3529f)
                curveTo(6.4673f, 4.0f, 5.5245f, 4.0f, 4.9387f, 4.5858f)
                curveTo(4.3529f, 5.1716f, 4.3529f, 6.1144f, 4.3529f, 8.0f)
                verticalLineTo(15.5357f)
                moveTo(19.6471f, 15.5357f)
                lineTo(21.3911f, 17.3358f)
                curveTo(21.4356f, 17.3818f, 21.4579f, 17.4048f, 21.4787f, 17.4276f)
                curveTo(21.7998f, 17.7802f, 21.9843f, 18.2358f, 21.999f, 18.7124f)
                curveTo(22.0f, 18.7433f, 22.0f, 18.7753f, 22.0f, 18.8393f)
                curveTo(22.0f, 18.9885f, 22.0f, 19.0631f, 21.996f, 19.1261f)
                curveTo(21.9325f, 20.1314f, 21.1314f, 20.9325f, 20.1261f, 20.996f)
                curveTo(20.0631f, 21.0f, 19.9885f, 21.0f, 19.8393f, 21.0f)
                horizontalLineTo(4.1607f)
                curveTo(4.0115f, 21.0f, 3.9369f, 21.0f, 3.8739f, 20.996f)
                curveTo(2.8686f, 20.9325f, 2.0675f, 20.1314f, 2.004f, 19.1261f)
                curveTo(2.0f, 19.0631f, 2.0f, 18.9885f, 2.0f, 18.8393f)
                curveTo(2.0f, 18.7753f, 2.0f, 18.7433f, 2.001f, 18.7124f)
                curveTo(2.0157f, 18.2358f, 2.2002f, 17.7802f, 2.5213f, 17.4276f)
                curveTo(2.5421f, 17.4048f, 2.5644f, 17.3818f, 2.6089f, 17.3358f)
                lineTo(4.3529f, 15.5357f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 18.5f)
                horizontalLineTo(14.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 6.75f)
                curveTo(12.75f, 7.1642f, 12.4142f, 7.5f, 12.0f, 7.5f)
                curveTo(11.5858f, 7.5f, 11.25f, 7.1642f, 11.25f, 6.75f)
                curveTo(11.25f, 6.3358f, 11.5858f, 6.0f, 12.0f, 6.0f)
                curveTo(12.4142f, 6.0f, 12.75f, 6.3358f, 12.75f, 6.75f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
