package com.chiksmedina.solar.bold.homefurniture

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
import com.chiksmedina.solar.bold.HomeFurnitureGroup

public val HomeFurnitureGroup.WashingMachineMinimalistic: ImageVector
    get() {
        if (_washingMachineMinimalistic != null) {
            return _washingMachineMinimalistic!!
        }
        _washingMachineMinimalistic = Builder(name = "WashingMachineMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1155f, 14.2081f)
                curveTo(8.0024f, 14.2809f, 7.8868f, 14.3548f, 7.771f, 14.4256f)
                curveTo(7.9845f, 16.573f, 9.7964f, 18.25f, 12.0f, 18.25f)
                curveTo(14.3472f, 18.25f, 16.25f, 16.3472f, 16.25f, 14.0f)
                lineTo(16.25f, 13.9945f)
                curveTo(16.1169f, 14.0184f, 15.9793f, 14.0397f, 15.8461f, 14.0603f)
                lineTo(15.8305f, 14.0627f)
                curveTo(15.6688f, 14.0878f, 15.5091f, 14.1125f, 15.3451f, 14.142f)
                curveTo(14.6442f, 14.2683f, 14.0781f, 14.2172f, 13.5869f, 14.036f)
                curveTo(13.1303f, 13.8675f, 12.786f, 13.6003f, 12.5321f, 13.4031f)
                lineTo(12.5084f, 13.3847f)
                curveTo(12.233f, 13.1711f, 12.0529f, 13.0377f, 11.83f, 12.9555f)
                curveTo(11.6273f, 12.8807f, 11.3371f, 12.832f, 10.857f, 12.9186f)
                curveTo(10.1533f, 13.0454f, 9.5239f, 13.3448f, 8.9424f, 13.688f)
                curveTo(8.6935f, 13.8348f, 8.4628f, 13.9839f, 8.2351f, 14.1309f)
                lineTo(8.1155f, 14.2081f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(21.0f, 4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.7712f, 21.0f, 19.6569f, 19.8284f, 20.8284f)
                curveTo(18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 22.0f, 5.3432f, 22.0f, 4.1716f, 20.8284f)
                curveTo(3.0f, 19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(17.75f, 14.0f)
                curveTo(17.75f, 13.7807f, 17.7377f, 13.5644f, 17.7138f, 13.3515f)
                lineTo(17.7338f, 13.3378f)
                lineTo(17.643f, 12.8902f)
                curveTo(17.1259f, 10.2456f, 14.796f, 8.25f, 12.0f, 8.25f)
                curveTo(8.8244f, 8.25f, 6.25f, 10.8244f, 6.25f, 14.0f)
                curveTo(6.25f, 17.1756f, 8.8244f, 19.75f, 12.0f, 19.75f)
                curveTo(15.1756f, 19.75f, 17.75f, 17.1756f, 17.75f, 14.0f)
                close()
                moveTo(8.0f, 5.25f)
                curveTo(7.5858f, 5.25f, 7.25f, 5.5858f, 7.25f, 6.0f)
                curveTo(7.25f, 6.4142f, 7.5858f, 6.75f, 8.0f, 6.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 6.75f, 16.75f, 6.4142f, 16.75f, 6.0f)
                curveTo(16.75f, 5.5858f, 16.4142f, 5.25f, 16.0f, 5.25f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _washingMachineMinimalistic!!
    }

private var _washingMachineMinimalistic: ImageVector? = null
