package com.chiksmedina.solar.bold.medicine

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
import com.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.AdhesivePlaster: ImageVector
    get() {
        if (_adhesivePlaster != null) {
            return _adhesivePlaster!!
        }
        _adhesivePlaster = Builder(
            name = "AdhesivePlaster", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.2132f, 3.2132f)
                curveTo(1.5956f, 4.8308f, 1.5956f, 7.4535f, 3.2132f, 9.0711f)
                lineTo(14.9289f, 20.7868f)
                curveTo(16.5465f, 22.4044f, 19.1692f, 22.4044f, 20.7868f, 20.7868f)
                curveTo(22.4044f, 19.1692f, 22.4044f, 16.5465f, 20.7868f, 14.9289f)
                lineTo(9.0711f, 3.2132f)
                curveTo(7.4535f, 1.5956f, 4.8308f, 1.5956f, 3.2132f, 3.2132f)
                close()
                moveTo(9.3446f, 8.2308f)
                curveTo(9.037f, 7.9233f, 8.5384f, 7.9233f, 8.2308f, 8.2308f)
                curveTo(7.9233f, 8.5384f, 7.9233f, 9.037f, 8.2308f, 9.3446f)
                curveTo(8.5384f, 9.6521f, 9.037f, 9.6521f, 9.3446f, 9.3446f)
                curveTo(9.6521f, 9.037f, 9.6521f, 8.5384f, 9.3446f, 8.2308f)
                close()
                moveTo(12.1289f, 9.1589f)
                curveTo(11.8214f, 8.8514f, 11.3227f, 8.8514f, 11.0152f, 9.1589f)
                curveTo(10.7076f, 9.4665f, 10.7076f, 9.9651f, 11.0152f, 10.2727f)
                curveTo(11.3227f, 10.5802f, 11.8214f, 10.5802f, 12.1289f, 10.2727f)
                curveTo(12.4365f, 9.9651f, 12.4365f, 9.4665f, 12.1289f, 9.1589f)
                close()
                moveTo(15.8414f, 12.8714f)
                curveTo(16.1489f, 13.179f, 16.1489f, 13.6776f, 15.8414f, 13.9852f)
                curveTo(15.5338f, 14.2927f, 15.0352f, 14.2927f, 14.7277f, 13.9852f)
                curveTo(14.4201f, 13.6776f, 14.4201f, 13.179f, 14.7277f, 12.8714f)
                curveTo(15.0352f, 12.5639f, 15.5338f, 12.5639f, 15.8414f, 12.8714f)
                close()
                moveTo(16.7695f, 16.7695f)
                curveTo(17.0771f, 16.462f, 17.0771f, 15.9633f, 16.7695f, 15.6558f)
                curveTo(16.462f, 15.3482f, 15.9633f, 15.3482f, 15.6558f, 15.6558f)
                curveTo(15.3482f, 15.9633f, 15.3482f, 16.462f, 15.6558f, 16.7695f)
                curveTo(15.9633f, 17.0771f, 16.462f, 17.0771f, 16.7695f, 16.7695f)
                close()
                moveTo(13.057f, 13.057f)
                curveTo(13.3646f, 12.7495f, 13.3646f, 12.2509f, 13.057f, 11.9433f)
                curveTo(12.7495f, 11.6358f, 12.2509f, 11.6358f, 11.9433f, 11.9433f)
                curveTo(11.6358f, 12.2509f, 11.6358f, 12.7495f, 11.9433f, 13.057f)
                curveTo(12.2509f, 13.3646f, 12.7495f, 13.3646f, 13.057f, 13.057f)
                close()
                moveTo(13.9852f, 14.7277f)
                curveTo(14.2927f, 15.0352f, 14.2927f, 15.5338f, 13.9852f, 15.8414f)
                curveTo(13.6776f, 16.1489f, 13.179f, 16.1489f, 12.8714f, 15.8414f)
                curveTo(12.5639f, 15.5338f, 12.5639f, 15.0352f, 12.8714f, 14.7277f)
                curveTo(13.179f, 14.4201f, 13.6776f, 14.4201f, 13.9852f, 14.7277f)
                close()
                moveTo(9.1589f, 11.0152f)
                curveTo(9.4665f, 10.7076f, 9.9651f, 10.7076f, 10.2727f, 11.0152f)
                curveTo(10.5802f, 11.3227f, 10.5802f, 11.8214f, 10.2727f, 12.1289f)
                curveTo(9.9651f, 12.4365f, 9.4665f, 12.4365f, 9.1589f, 12.1289f)
                curveTo(8.8514f, 11.8214f, 8.8514f, 11.3227f, 9.1589f, 11.0152f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0815f, 13.0607f)
                lineTo(3.2132f, 14.9289f)
                curveTo(1.5956f, 16.5465f, 1.5956f, 19.1692f, 3.2132f, 20.7868f)
                curveTo(4.8308f, 22.4044f, 7.4535f, 22.4044f, 9.0711f, 20.7868f)
                lineTo(10.9393f, 18.9185f)
                lineTo(5.0815f, 13.0607f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.9185f, 10.9393f)
                lineTo(20.7868f, 9.0711f)
                curveTo(22.4044f, 7.4535f, 22.4044f, 4.8308f, 20.7868f, 3.2132f)
                curveTo(19.1692f, 1.5956f, 16.5465f, 1.5956f, 14.9289f, 3.2132f)
                lineTo(13.0607f, 5.0815f)
                lineTo(18.9185f, 10.9393f)
                close()
            }
        }
            .build()
        return _adhesivePlaster!!
    }

private var _adhesivePlaster: ImageVector? = null
