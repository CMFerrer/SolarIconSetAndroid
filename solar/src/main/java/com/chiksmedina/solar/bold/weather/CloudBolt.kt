package com.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.CloudBolt: ImageVector
    get() {
        if (_cloudBolt != null) {
            return _cloudBolt!!
        }
        _cloudBolt = Builder(
            name = "CloudBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.6261f, 17.4647f)
                lineTo(10.7744f, 15.91f)
                curveTo(11.5166f, 14.905f, 11.8878f, 14.4025f, 12.234f, 14.5087f)
                curveTo(12.5803f, 14.6149f, 12.5803f, 15.2312f, 12.5803f, 16.4638f)
                verticalLineTo(16.58f)
                curveTo(12.5803f, 17.0246f, 12.5803f, 17.2469f, 12.7222f, 17.3863f)
                lineTo(12.7297f, 17.3935f)
                curveTo(12.8748f, 17.53f, 13.106f, 17.53f, 13.5683f, 17.53f)
                curveTo(14.4004f, 17.53f, 14.8165f, 17.53f, 14.9571f, 17.7825f)
                curveTo(14.9594f, 17.7867f, 14.9617f, 17.7909f, 14.9639f, 17.7952f)
                curveTo(15.0966f, 18.0516f, 14.8557f, 18.3778f, 14.3739f, 19.0301f)
                lineTo(13.2256f, 20.5848f)
                curveTo(12.4833f, 21.5897f, 12.1122f, 22.0922f, 11.7659f, 21.986f)
                curveTo(11.4197f, 21.8798f, 11.4197f, 21.2635f, 11.4197f, 20.0309f)
                lineTo(11.4197f, 19.9148f)
                curveTo(11.4197f, 19.4702f, 11.4197f, 19.2479f, 11.2778f, 19.1085f)
                lineTo(11.2703f, 19.1012f)
                curveTo(11.1252f, 18.9648f, 10.894f, 18.9648f, 10.4317f, 18.9648f)
                curveTo(9.5996f, 18.9648f, 9.1835f, 18.9648f, 9.0429f, 18.7122f)
                curveTo(9.0406f, 18.708f, 9.0384f, 18.7038f, 9.0361f, 18.6996f)
                curveTo(8.9034f, 18.4431f, 9.1443f, 18.117f, 9.6261f, 17.4647f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5775f, 18.0112f)
                curveTo(7.6367f, 17.8041f, 7.7173f, 17.6363f, 7.7767f, 17.5248f)
                curveTo(7.9344f, 17.2285f, 8.1754f, 16.9027f, 8.3778f, 16.629f)
                lineTo(9.6185f, 14.9492f)
                curveTo(9.945f, 14.5069f, 10.2737f, 14.0616f, 10.5718f, 13.7516f)
                curveTo(10.7896f, 13.5251f, 11.5685f, 12.7345f, 12.6735f, 13.0733f)
                curveTo(13.8116f, 13.4224f, 13.9817f, 14.5527f, 14.0235f, 14.8632f)
                curveTo(14.0684f, 15.1965f, 14.0779f, 15.6082f, 14.0798f, 16.0315f)
                curveTo(14.3047f, 16.0358f, 14.5305f, 16.0469f, 14.7297f, 16.0748f)
                curveTo(15.0643f, 16.1216f, 15.8367f, 16.2783f, 16.2673f, 17.0517f)
                curveTo(16.2771f, 17.0692f, 16.2866f, 17.0869f, 16.2957f, 17.1046f)
                curveTo(16.4608f, 17.4236f, 16.5105f, 17.7318f, 16.5f, 18.0073f)
                curveTo(19.5566f, 17.8959f, 22.0f, 15.4102f, 22.0f, 12.3602f)
                curveTo(22.0f, 9.8866f, 20.393f, 7.7843f, 18.1551f, 7.0185f)
                curveTo(17.8371f, 4.1952f, 15.4159f, 2.0f, 12.4762f, 2.0f)
                curveTo(9.3203f, 2.0f, 6.7619f, 4.53f, 6.7619f, 7.651f)
                curveTo(6.7619f, 8.3413f, 6.8871f, 9.0027f, 7.1162f, 9.6142f)
                curveTo(6.8475f, 9.562f, 6.5698f, 9.5347f, 6.2857f, 9.5347f)
                curveTo(3.9188f, 9.5347f, 2.0f, 11.4322f, 2.0f, 13.7729f)
                curveTo(2.0f, 16.1137f, 3.9188f, 18.0112f, 6.2857f, 18.0112f)
                horizontalLineTo(7.5775f)
                close()
            }
        }
            .build()
        return _cloudBolt!!
    }

private var _cloudBolt: ImageVector? = null
