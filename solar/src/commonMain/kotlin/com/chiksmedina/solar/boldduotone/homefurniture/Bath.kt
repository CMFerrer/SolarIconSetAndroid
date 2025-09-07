package com.chiksmedina.solar.boldduotone.homefurniture

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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(
            name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(1.75f)
                curveTo(1.3358f, 11.0f, 1.0f, 11.3358f, 1.0f, 11.75f)
                curveTo(1.0f, 12.1642f, 1.3358f, 12.5f, 1.75f, 12.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.75f)
                lineTo(2.0001f, 12.7614f)
                lineTo(2.0f, 12.8168f)
                lineTo(2.0f, 12.8546f)
                curveTo(2.0f, 13.2299f, 2.0f, 13.4498f, 2.0156f, 13.6952f)
                curveTo(2.1575f, 15.9316f, 3.366f, 17.9968f, 5.1176f, 19.3472f)
                curveTo(5.2753f, 19.4726f, 6.0307f, 19.9348f, 6.3887f, 20.1501f)
                curveTo(7.1904f, 20.5559f, 8.0623f, 20.823f, 8.9691f, 20.9148f)
                curveTo(9.2135f, 20.9396f, 9.3628f, 20.9452f, 9.6169f, 20.9548f)
                lineTo(9.6237f, 20.955f)
                curveTo(10.3639f, 20.9828f, 11.0885f, 21.0f, 11.75f, 21.0f)
                curveTo(12.4115f, 21.0f, 13.1361f, 20.9828f, 13.8763f, 20.955f)
                lineTo(13.883f, 20.9548f)
                curveTo(14.1372f, 20.9452f, 14.2865f, 20.9396f, 14.5309f, 20.9148f)
                curveTo(15.4378f, 20.823f, 16.3098f, 20.5559f, 17.1116f, 20.15f)
                curveTo(17.45f, 19.9508f, 18.178f, 19.5114f, 18.3827f, 19.347f)
                curveTo(20.1341f, 17.9966f, 21.3425f, 15.9315f, 21.4845f, 13.6952f)
                curveTo(21.5f, 13.4498f, 21.5f, 13.2299f, 21.5f, 12.8546f)
                lineTo(21.5f, 12.8168f)
                curveTo(21.5f, 12.7567f, 21.5001f, 12.6942f, 21.4963f, 12.6365f)
                curveTo(21.4933f, 12.5905f, 21.4886f, 12.545f, 21.4821f, 12.5f)
                horizontalLineTo(21.75f)
                curveTo(22.1642f, 12.5f, 22.5f, 12.1642f, 22.5f, 11.75f)
                curveTo(22.5f, 11.3358f, 22.1642f, 11.0f, 21.75f, 11.0f)
                horizontalLineTo(3.5f)
                horizontalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.1176f, 19.3472f)
                curveTo(5.1038f, 19.3688f, 5.0911f, 19.3913f, 5.0793f, 19.4148f)
                lineTo(4.0793f, 21.4148f)
                curveTo(3.8941f, 21.7853f, 4.0443f, 22.2358f, 4.4148f, 22.421f)
                curveTo(4.7852f, 22.6062f, 5.2357f, 22.4561f, 5.421f, 22.0856f)
                lineTo(6.3887f, 20.1502f)
                curveTo(6.0307f, 19.9348f, 5.2753f, 19.4727f, 5.1176f, 19.3472f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.1113f, 20.1499f)
                lineTo(18.0791f, 22.0855f)
                curveTo(18.2643f, 22.456f, 18.7149f, 22.6062f, 19.0853f, 22.4209f)
                curveTo(19.4558f, 22.2357f, 19.606f, 21.7852f, 19.4207f, 21.4147f)
                lineTo(18.4207f, 19.4147f)
                curveTo(18.409f, 19.3912f, 18.3962f, 19.3686f, 18.3824f, 19.3469f)
                curveTo(18.1778f, 19.5113f, 17.4498f, 19.9508f, 17.1113f, 20.1499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5f, 4.1352f)
                curveTo(3.5f, 3.2321f, 4.2321f, 2.5f, 5.1352f, 2.5f)
                curveTo(5.8038f, 2.5f, 6.405f, 2.9071f, 6.6534f, 3.5279f)
                lineTo(6.7966f, 3.8861f)
                lineTo(8.1562f, 3.2461f)
                lineTo(8.0461f, 2.9708f)
                curveTo(7.57f, 1.7805f, 6.4172f, 1.0f, 5.1352f, 1.0f)
                curveTo(3.4037f, 1.0f, 2.0f, 2.4037f, 2.0f, 4.1352f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(4.1352f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.7965f, 3.886f)
                curveTo(6.202f, 4.3192f, 5.7163f, 4.9233f, 5.4171f, 5.6601f)
                curveTo(4.9968f, 6.6951f, 5.0194f, 7.8066f, 5.3976f, 8.7665f)
                curveTo(5.4721f, 8.9553f, 5.6198f, 9.1059f, 5.8072f, 9.1839f)
                curveTo(5.9946f, 9.2619f, 6.2056f, 9.2606f, 6.392f, 9.1804f)
                lineTo(12.3527f, 6.6143f)
                curveTo(12.7248f, 6.4541f, 12.9025f, 6.0274f, 12.754f, 5.6505f)
                curveTo(12.3756f, 4.6902f, 11.6368f, 3.8719f, 10.6215f, 3.4381f)
                curveTo(9.8102f, 3.0915f, 8.9494f, 3.0448f, 8.1561f, 3.2461f)
                lineTo(6.7965f, 3.886f)
                close()
            }
        }
            .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
