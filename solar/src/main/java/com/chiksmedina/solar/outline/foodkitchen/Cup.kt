package com.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.Cup: ImageVector
    get() {
        if (_cup != null) {
            return _cup!!
        }
        _cup = Builder(
            name = "Cup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.948f, 2.25f)
                horizontalLineTo(13.052f)
                curveTo(13.9505f, 2.25f, 14.6997f, 2.2499f, 15.2945f, 2.3299f)
                curveTo(15.9223f, 2.4143f, 16.4891f, 2.6f, 16.9445f, 3.0555f)
                curveTo(17.2869f, 3.3979f, 17.4769f, 3.8032f, 17.5859f, 4.25f)
                horizontalLineTo(18.0f)
                curveTo(20.6234f, 4.25f, 22.75f, 6.3766f, 22.75f, 9.0f)
                curveTo(22.75f, 11.6234f, 20.6234f, 13.75f, 18.0f, 13.75f)
                horizontalLineTo(17.7393f)
                curveTo(17.7262f, 14.3712f, 17.6973f, 14.9168f, 17.6335f, 15.3918f)
                curveTo(17.5125f, 16.2919f, 17.2536f, 17.0497f, 16.6517f, 17.6517f)
                curveTo(16.0497f, 18.2536f, 15.2919f, 18.5125f, 14.3918f, 18.6335f)
                curveTo(13.5248f, 18.75f, 12.4225f, 18.75f, 11.0549f, 18.75f)
                horizontalLineTo(8.9451f)
                curveTo(7.5775f, 18.75f, 6.4752f, 18.75f, 5.6083f, 18.6335f)
                curveTo(4.7081f, 18.5125f, 3.9503f, 18.2536f, 3.3484f, 17.6517f)
                curveTo(2.7464f, 17.0497f, 2.4875f, 16.2919f, 2.3665f, 15.3918f)
                curveTo(2.2798f, 14.7469f, 2.2576f, 13.9719f, 2.252f, 13.0544f)
                curveTo(2.2507f, 13.0365f, 2.25f, 13.0183f, 2.25f, 13.0f)
                curveTo(2.25f, 12.9845f, 2.2505f, 12.9692f, 2.2514f, 12.954f)
                curveTo(2.25f, 12.668f, 2.25f, 12.3684f, 2.25f, 12.0549f)
                lineTo(2.25f, 6.948f)
                curveTo(2.25f, 6.0495f, 2.2499f, 5.3003f, 2.3299f, 4.7055f)
                curveTo(2.4143f, 4.0777f, 2.6f, 3.5109f, 3.0555f, 3.0555f)
                curveTo(3.5109f, 2.6f, 4.0777f, 2.4143f, 4.7055f, 2.3299f)
                curveTo(5.3003f, 2.2499f, 6.0495f, 2.25f, 6.948f, 2.25f)
                close()
                moveTo(3.7611f, 13.75f)
                curveTo(3.7734f, 14.319f, 3.7991f, 14.7902f, 3.8531f, 15.1919f)
                curveTo(3.9518f, 15.9257f, 4.1322f, 16.3142f, 4.409f, 16.591f)
                curveTo(4.6858f, 16.8678f, 5.0743f, 17.0482f, 5.8081f, 17.1469f)
                curveTo(6.5635f, 17.2484f, 7.5646f, 17.25f, 9.0f, 17.25f)
                horizontalLineTo(11.0f)
                curveTo(12.4354f, 17.25f, 13.4365f, 17.2484f, 14.1919f, 17.1469f)
                curveTo(14.9257f, 17.0482f, 15.3142f, 16.8678f, 15.591f, 16.591f)
                curveTo(15.8678f, 16.3142f, 16.0482f, 15.9257f, 16.1469f, 15.1919f)
                curveTo(16.2009f, 14.7902f, 16.2266f, 14.319f, 16.2389f, 13.75f)
                horizontalLineTo(3.7611f)
                close()
                moveTo(16.25f, 12.25f)
                horizontalLineTo(3.75f)
                curveTo(3.75f, 12.1682f, 3.75f, 12.0848f, 3.75f, 12.0f)
                verticalLineTo(7.0f)
                curveTo(3.75f, 6.036f, 3.7516f, 5.3884f, 3.8165f, 4.9054f)
                curveTo(3.8786f, 4.4439f, 3.9858f, 4.2464f, 4.1161f, 4.1161f)
                curveTo(4.2464f, 3.9858f, 4.4439f, 3.8786f, 4.9054f, 3.8165f)
                curveTo(5.3884f, 3.7516f, 6.036f, 3.75f, 7.0f, 3.75f)
                horizontalLineTo(13.0f)
                curveTo(13.964f, 3.75f, 14.6116f, 3.7516f, 15.0946f, 3.8165f)
                curveTo(15.5561f, 3.8786f, 15.7536f, 3.9858f, 15.8839f, 4.1161f)
                curveTo(16.0142f, 4.2464f, 16.1214f, 4.4439f, 16.1835f, 4.9054f)
                curveTo(16.2484f, 5.3884f, 16.25f, 6.036f, 16.25f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(16.25f, 12.0848f, 16.25f, 12.1682f, 16.25f, 12.25f)
                close()
                moveTo(17.75f, 12.25f)
                horizontalLineTo(18.0f)
                curveTo(19.7949f, 12.25f, 21.25f, 10.7949f, 21.25f, 9.0f)
                curveTo(21.25f, 7.2051f, 19.7949f, 5.75f, 18.0f, 5.75f)
                horizontalLineTo(17.741f)
                curveTo(17.75f, 6.114f, 17.75f, 6.5136f, 17.75f, 6.948f)
                lineTo(17.75f, 12.0549f)
                curveTo(17.75f, 12.1205f, 17.75f, 12.1856f, 17.75f, 12.25f)
                close()
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
            }
        }
            .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
