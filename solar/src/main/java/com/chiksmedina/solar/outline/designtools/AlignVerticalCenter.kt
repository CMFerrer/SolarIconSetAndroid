package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.AlignVerticalCenter: ImageVector
    get() {
        if (_alignVerticalCenter != null) {
            return _alignVerticalCenter!!
        }
        _alignVerticalCenter = Builder(
            name = "AlignVerticalCenter", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.4678f, 4.25f)
                horizontalLineTo(7.5322f)
                curveTo(7.972f, 4.25f, 8.3514f, 4.25f, 8.6627f, 4.2782f)
                curveTo(8.9918f, 4.308f, 9.3178f, 4.3741f, 9.625f, 4.5514f)
                curveTo(9.967f, 4.7489f, 10.2511f, 5.033f, 10.4486f, 5.375f)
                curveTo(10.6259f, 5.6822f, 10.692f, 6.0082f, 10.7218f, 6.3373f)
                curveTo(10.75f, 6.6487f, 10.75f, 7.028f, 10.75f, 7.4678f)
                lineTo(10.75f, 11.25f)
                horizontalLineTo(13.25f)
                verticalLineTo(9.4678f)
                curveTo(13.25f, 9.028f, 13.25f, 8.6487f, 13.2782f, 8.3373f)
                curveTo(13.308f, 8.0082f, 13.3741f, 7.6822f, 13.5514f, 7.375f)
                curveTo(13.7489f, 7.033f, 14.033f, 6.7489f, 14.375f, 6.5514f)
                curveTo(14.6822f, 6.3741f, 15.0082f, 6.308f, 15.3373f, 6.2782f)
                curveTo(15.6486f, 6.25f, 16.028f, 6.25f, 16.4678f, 6.25f)
                horizontalLineTo(16.5322f)
                curveTo(16.972f, 6.25f, 17.3514f, 6.25f, 17.6627f, 6.2782f)
                curveTo(17.9918f, 6.308f, 18.3178f, 6.3741f, 18.625f, 6.5514f)
                curveTo(18.967f, 6.7489f, 19.2511f, 7.033f, 19.4486f, 7.375f)
                curveTo(19.6259f, 7.6822f, 19.692f, 8.0082f, 19.7218f, 8.3373f)
                curveTo(19.75f, 8.6486f, 19.75f, 9.028f, 19.75f, 9.4677f)
                verticalLineTo(11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(19.75f)
                verticalLineTo(14.5322f)
                curveTo(19.75f, 14.972f, 19.75f, 15.3514f, 19.7218f, 15.6627f)
                curveTo(19.692f, 15.9918f, 19.6259f, 16.3178f, 19.4486f, 16.625f)
                curveTo(19.2511f, 16.967f, 18.967f, 17.2511f, 18.625f, 17.4486f)
                curveTo(18.3178f, 17.6259f, 17.9918f, 17.692f, 17.6627f, 17.7218f)
                curveTo(17.3514f, 17.75f, 16.972f, 17.75f, 16.5322f, 17.75f)
                horizontalLineTo(16.4678f)
                curveTo(16.028f, 17.75f, 15.6486f, 17.75f, 15.3373f, 17.7218f)
                curveTo(15.0082f, 17.692f, 14.6822f, 17.6259f, 14.375f, 17.4486f)
                curveTo(14.033f, 17.2511f, 13.7489f, 16.967f, 13.5514f, 16.625f)
                curveTo(13.3741f, 16.3178f, 13.308f, 15.9918f, 13.2782f, 15.6627f)
                curveTo(13.25f, 15.3514f, 13.25f, 14.972f, 13.25f, 14.5322f)
                verticalLineTo(12.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(16.5322f)
                curveTo(10.75f, 16.972f, 10.75f, 17.3514f, 10.7218f, 17.6627f)
                curveTo(10.692f, 17.9918f, 10.6259f, 18.3178f, 10.4486f, 18.625f)
                curveTo(10.2511f, 18.967f, 9.967f, 19.2511f, 9.625f, 19.4486f)
                curveTo(9.3178f, 19.6259f, 8.9918f, 19.692f, 8.6627f, 19.7218f)
                curveTo(8.3513f, 19.75f, 7.972f, 19.75f, 7.5322f, 19.75f)
                horizontalLineTo(7.4678f)
                curveTo(7.028f, 19.75f, 6.6487f, 19.75f, 6.3373f, 19.7218f)
                curveTo(6.0082f, 19.692f, 5.6822f, 19.6259f, 5.375f, 19.4486f)
                curveTo(5.033f, 19.2511f, 4.7489f, 18.967f, 4.5514f, 18.625f)
                curveTo(4.3741f, 18.3178f, 4.308f, 17.9918f, 4.2782f, 17.6627f)
                curveTo(4.25f, 17.3514f, 4.25f, 16.972f, 4.25f, 16.5322f)
                lineTo(4.25f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.25f)
                lineTo(4.25f, 7.5f)
                curveTo(4.25f, 7.4892f, 4.25f, 7.4785f, 4.25f, 7.4678f)
                curveTo(4.25f, 7.028f, 4.25f, 6.6486f, 4.2782f, 6.3373f)
                curveTo(4.308f, 6.0082f, 4.3741f, 5.6822f, 4.5514f, 5.375f)
                curveTo(4.7489f, 5.033f, 5.033f, 4.7489f, 5.375f, 4.5514f)
                curveTo(5.6822f, 4.3741f, 6.0082f, 4.308f, 6.3373f, 4.2782f)
                curveTo(6.6486f, 4.25f, 7.028f, 4.25f, 7.4678f, 4.25f)
                close()
                moveTo(5.75f, 12.001f)
                curveTo(5.75f, 12.0007f, 5.75f, 12.0004f, 5.75f, 12.0f)
                curveTo(5.75f, 11.9997f, 5.75f, 11.9993f, 5.75f, 11.999f)
                lineTo(5.75f, 7.5f)
                curveTo(5.75f, 7.0189f, 5.7507f, 6.7082f, 5.7721f, 6.4728f)
                curveTo(5.7925f, 6.2476f, 5.8269f, 6.1659f, 5.8505f, 6.125f)
                curveTo(5.9163f, 6.011f, 6.011f, 5.9163f, 6.125f, 5.8505f)
                curveTo(6.1659f, 5.8269f, 6.2476f, 5.7925f, 6.4727f, 5.7721f)
                curveTo(6.7082f, 5.7507f, 7.0189f, 5.75f, 7.5f, 5.75f)
                curveTo(7.9811f, 5.75f, 8.2918f, 5.7507f, 8.5273f, 5.7721f)
                curveTo(8.7524f, 5.7925f, 8.8341f, 5.8269f, 8.875f, 5.8505f)
                curveTo(8.989f, 5.9163f, 9.0837f, 6.011f, 9.1495f, 6.125f)
                curveTo(9.1731f, 6.1659f, 9.2075f, 6.2476f, 9.2279f, 6.4728f)
                curveTo(9.2493f, 6.7082f, 9.25f, 7.0189f, 9.25f, 7.5f)
                lineTo(9.25f, 16.5f)
                curveTo(9.25f, 16.9811f, 9.2493f, 17.2918f, 9.2279f, 17.5273f)
                curveTo(9.2075f, 17.7524f, 9.1731f, 17.8341f, 9.1495f, 17.875f)
                curveTo(9.0837f, 17.989f, 8.989f, 18.0837f, 8.875f, 18.1495f)
                curveTo(8.8341f, 18.1731f, 8.7524f, 18.2075f, 8.5273f, 18.2279f)
                curveTo(8.2918f, 18.2493f, 7.9811f, 18.25f, 7.5f, 18.25f)
                curveTo(7.0189f, 18.25f, 6.7082f, 18.2493f, 6.4727f, 18.2279f)
                curveTo(6.2476f, 18.2075f, 6.1659f, 18.1731f, 6.125f, 18.1495f)
                curveTo(6.011f, 18.0837f, 5.9163f, 17.989f, 5.8505f, 17.875f)
                curveTo(5.8269f, 17.8341f, 5.7925f, 17.7524f, 5.7721f, 17.5273f)
                curveTo(5.7507f, 17.2918f, 5.75f, 16.9811f, 5.75f, 16.5f)
                verticalLineTo(12.001f)
                close()
                moveTo(14.75f, 14.5f)
                curveTo(14.75f, 14.9811f, 14.7507f, 15.2918f, 14.7721f, 15.5273f)
                curveTo(14.7925f, 15.7524f, 14.8269f, 15.8341f, 14.8505f, 15.875f)
                curveTo(14.9163f, 15.989f, 15.011f, 16.0837f, 15.125f, 16.1495f)
                curveTo(15.1659f, 16.1731f, 15.2476f, 16.2075f, 15.4727f, 16.2279f)
                curveTo(15.7082f, 16.2493f, 16.0189f, 16.25f, 16.5f, 16.25f)
                curveTo(16.9811f, 16.25f, 17.2918f, 16.2493f, 17.5273f, 16.2279f)
                curveTo(17.7524f, 16.2075f, 17.8341f, 16.1731f, 17.875f, 16.1495f)
                curveTo(17.989f, 16.0837f, 18.0837f, 15.989f, 18.1495f, 15.875f)
                curveTo(18.1731f, 15.8341f, 18.2075f, 15.7524f, 18.2279f, 15.5273f)
                curveTo(18.2493f, 15.2918f, 18.25f, 14.9811f, 18.25f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(18.25f, 9.0189f, 18.2493f, 8.7082f, 18.2279f, 8.4727f)
                curveTo(18.2075f, 8.2476f, 18.1731f, 8.1659f, 18.1495f, 8.125f)
                curveTo(18.0837f, 8.011f, 17.989f, 7.9163f, 17.875f, 7.8505f)
                curveTo(17.8341f, 7.8269f, 17.7524f, 7.7925f, 17.5273f, 7.7721f)
                curveTo(17.2918f, 7.7507f, 16.9811f, 7.75f, 16.5f, 7.75f)
                curveTo(16.0189f, 7.75f, 15.7082f, 7.7507f, 15.4727f, 7.7721f)
                curveTo(15.2476f, 7.7925f, 15.1659f, 7.8269f, 15.125f, 7.8505f)
                curveTo(15.011f, 7.9163f, 14.9163f, 8.011f, 14.8505f, 8.125f)
                curveTo(14.8269f, 8.1659f, 14.7925f, 8.2476f, 14.7721f, 8.4727f)
                curveTo(14.7507f, 8.7082f, 14.75f, 9.0189f, 14.75f, 9.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
            .build()
        return _alignVerticalCenter!!
    }

private var _alignVerticalCenter: ImageVector? = null
