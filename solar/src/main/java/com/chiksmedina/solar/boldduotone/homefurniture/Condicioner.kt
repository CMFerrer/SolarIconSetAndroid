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

val HomeFurnitureGroup.Condicioner: ImageVector
    get() {
        if (_condicioner != null) {
            return _condicioner!!
        }
        _condicioner = Builder(
            name = "Condicioner", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 2.0f, 20.8284f, 2.0f, 21.4142f, 2.5858f)
                curveTo(22.0f, 3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 11.8284f, 22.0f, 13.2426f, 21.1213f, 14.1213f)
                curveTo(20.5902f, 14.6524f, 19.8634f, 14.8625f, 18.7469f, 14.9456f)
                curveTo(18.7417f, 14.2769f, 18.7273f, 13.5437f, 18.6884f, 13.2542f)
                curveTo(18.6223f, 12.7625f, 18.4732f, 12.2913f, 18.091f, 11.909f)
                curveTo(17.7087f, 11.5268f, 17.2375f, 11.3777f, 16.7458f, 11.3116f)
                curveTo(16.2871f, 11.2499f, 15.7142f, 11.25f, 15.0494f, 11.25f)
                horizontalLineTo(8.9506f)
                curveTo(8.2858f, 11.25f, 7.7129f, 11.2499f, 7.2542f, 11.3116f)
                curveTo(6.7625f, 11.3777f, 6.2913f, 11.5268f, 5.909f, 11.909f)
                curveTo(5.5268f, 12.2913f, 5.3777f, 12.7625f, 5.3116f, 13.2542f)
                curveTo(5.2727f, 13.5437f, 5.2583f, 14.2769f, 5.2531f, 14.9456f)
                curveTo(4.1366f, 14.8625f, 3.4098f, 14.6524f, 2.8787f, 14.1213f)
                curveTo(2.0f, 13.2426f, 2.0f, 11.8284f, 2.0f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.1144f, 2.0f, 3.1716f, 2.5858f, 2.5858f)
                curveTo(3.1716f, 2.0f, 4.1144f, 2.0f, 6.0f, 2.0f)
                close()
                moveTo(5.25f, 8.5f)
                curveTo(5.25f, 8.0858f, 5.5858f, 7.75f, 6.0f, 7.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 7.75f, 18.75f, 8.0858f, 18.75f, 8.5f)
                curveTo(18.75f, 8.9142f, 18.4142f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 9.25f, 5.25f, 8.9142f, 5.25f, 8.5f)
                close()
                moveTo(5.25f, 6.0f)
                curveTo(5.25f, 5.5858f, 5.5858f, 5.25f, 6.0f, 5.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 5.25f, 18.75f, 5.5858f, 18.75f, 6.0f)
                curveTo(18.75f, 6.4142f, 18.4142f, 6.75f, 18.0f, 6.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 6.75f, 5.25f, 6.4142f, 5.25f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.7469f, 14.9456f)
                horizontalLineTo(5.253f)
                curveTo(5.2583f, 14.2769f, 5.2727f, 13.5437f, 5.3116f, 13.2542f)
                curveTo(5.3777f, 12.7625f, 5.5268f, 12.2913f, 5.909f, 11.909f)
                curveTo(6.2913f, 11.5268f, 6.7625f, 11.3777f, 7.2541f, 11.3116f)
                curveTo(7.7129f, 11.2499f, 8.2858f, 11.25f, 8.9506f, 11.25f)
                lineTo(15.0494f, 11.25f)
                curveTo(15.7142f, 11.25f, 16.2871f, 11.2499f, 16.7458f, 11.3116f)
                curveTo(17.2375f, 11.3777f, 17.7087f, 11.5268f, 18.091f, 11.909f)
                curveTo(18.4732f, 12.2913f, 18.6223f, 12.7625f, 18.6884f, 13.2542f)
                curveTo(18.7273f, 13.5437f, 18.7417f, 14.2769f, 18.7469f, 14.9456f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(6.8352f, 16.8293f)
                curveTo(7.2057f, 17.0146f, 7.3559f, 17.4651f, 7.1706f, 17.8356f)
                lineTo(6.9868f, 18.2031f)
                curveTo(6.9424f, 18.2921f, 6.9598f, 18.3995f, 7.0301f, 18.4698f)
                curveTo(7.557f, 18.9967f, 7.6876f, 19.8016f, 7.3544f, 20.468f)
                lineTo(7.1706f, 20.8356f)
                curveTo(6.9854f, 21.2061f, 6.5349f, 21.3562f, 6.1644f, 21.171f)
                curveTo(5.7939f, 20.9857f, 5.6437f, 20.5352f, 5.829f, 20.1648f)
                lineTo(6.0128f, 19.7972f)
                curveTo(6.0572f, 19.7083f, 6.0398f, 19.6008f, 5.9695f, 19.5305f)
                curveTo(5.4426f, 19.0036f, 5.312f, 18.1987f, 5.6452f, 17.5323f)
                lineTo(5.829f, 17.1648f)
                curveTo(6.0142f, 16.7943f, 6.4647f, 16.6441f, 6.8352f, 16.8293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(17.8352f, 16.8293f)
                curveTo(18.2057f, 17.0146f, 18.3559f, 17.4651f, 18.1706f, 17.8356f)
                lineTo(17.9868f, 18.2031f)
                curveTo(17.9424f, 18.2921f, 17.9598f, 18.3995f, 18.0301f, 18.4698f)
                curveTo(18.557f, 18.9967f, 18.6876f, 19.8016f, 18.3544f, 20.468f)
                lineTo(18.1706f, 20.8356f)
                curveTo(17.9854f, 21.2061f, 17.5349f, 21.3562f, 17.1644f, 21.171f)
                curveTo(16.7939f, 20.9857f, 16.6437f, 20.5352f, 16.829f, 20.1648f)
                lineTo(17.0127f, 19.7972f)
                curveTo(17.0572f, 19.7083f, 17.0398f, 19.6008f, 16.9695f, 19.5305f)
                curveTo(16.4426f, 19.0036f, 16.312f, 18.1987f, 16.6452f, 17.5323f)
                lineTo(16.829f, 17.1648f)
                curveTo(17.0142f, 16.7943f, 17.4647f, 16.6441f, 17.8352f, 16.8293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.4159f, 16.876f)
                curveTo(12.7606f, 17.1058f, 12.8537f, 17.5715f, 12.6239f, 17.9161f)
                lineTo(12.3173f, 18.376f)
                curveTo(12.1491f, 18.6284f, 12.2073f, 18.9681f, 12.4499f, 19.1501f)
                curveTo(13.3294f, 19.8097f, 13.5404f, 21.0415f, 12.9305f, 21.9562f)
                lineTo(12.6239f, 22.4161f)
                curveTo(12.3942f, 22.7608f, 11.9285f, 22.8539f, 11.5839f, 22.6241f)
                curveTo(11.2392f, 22.3944f, 11.1461f, 21.9287f, 11.3758f, 21.5841f)
                lineTo(11.6825f, 21.1241f)
                curveTo(11.8507f, 20.8718f, 11.7925f, 20.532f, 11.5499f, 20.3501f)
                curveTo(10.6704f, 19.6905f, 10.4594f, 18.4587f, 11.0692f, 17.544f)
                lineTo(11.3758f, 17.0841f)
                curveTo(11.6056f, 16.7394f, 12.0713f, 16.6463f, 12.4159f, 16.876f)
                close()
            }
        }
            .build()
        return _condicioner!!
    }

private var _condicioner: ImageVector? = null
